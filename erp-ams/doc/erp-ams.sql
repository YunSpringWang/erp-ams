/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2018/1/4 9:52:33                             */
/*==============================================================*/


drop table if exists authority_menu_relation;

drop table if exists authority_org_relation;

drop table if exists code_data;

drop table if exists role_authority_relation;

drop table if exists role_org_relation;

drop table if exists sys_authority;

drop table if exists sys_code;

drop table if exists sys_excepetion_logs;

drop table if exists sys_login_logs;

drop table if exists sys_menu;

drop table if exists sys_organization;

drop table if exists sys_role;

drop table if exists sys_user;

drop table if exists user_login;

/*==============================================================*/
/* Table: authority_menu_relation                               */
/*==============================================================*/
create table authority_menu_relation
(
   menu_id              int not null,
   sys_authority_id     int not null,
   primary key (menu_id, sys_authority_id)
);

/*==============================================================*/
/* Table: authority_org_relation                                */
/*==============================================================*/
create table authority_org_relation
(
   sys_authority_id     int not null,
   org_id               int not null,
   primary key (sys_authority_id, org_id)
);

/*==============================================================*/
/* Table: code_data                                             */
/*==============================================================*/
create table code_data
(
   data_id              int not null,
   code_id              varchar(32),
   data_name            varchar(24),
   primary key (data_id)
);

/*==============================================================*/
/* Table: role_authority_relation                               */
/*==============================================================*/
create table role_authority_relation
(
   role_id              int not null,
   sys_authority_id     int not null,
   primary key (role_id, sys_authority_id)
);

/*==============================================================*/
/* Table: role_org_relation                                     */
/*==============================================================*/
create table role_org_relation
(
   role_id              int not null,
   org_id               int not null,
   primary key (role_id, org_id)
);

/*==============================================================*/
/* Table: sys_authority                                         */
/*==============================================================*/
create table sys_authority
(
   sys_authority_id     int not null,
   sys_authority_father_id int,
   sys_authority_name   varchar(24),
   sys_authority_create_date timestamp,
   sys_authority_description text,
   sys_authority_type   varchar(24),
   primary key (sys_authority_id)
);

/*==============================================================*/
/* Table: sys_code                                              */
/*==============================================================*/
create table sys_code
(
   code_id              varchar(32) not null,
   code                 varchar(24),
   code_name            varchar(24),
   primary key (code_id)
);

/*==============================================================*/
/* Table: sys_excepetion_logs                                   */
/*==============================================================*/
create table sys_excepetion_logs
(
   excepetion_id        varchar(32) not null,
   login_id             varchar(32),
   excepetion_class     varchar(50),
   excepetion_method    varchar(50),
   excepetion_type      int,
   excepetion_time      timestamp,
   excepetion_content   text,
   excepetion_status    int,
   primary key (excepetion_id)
);

/*==============================================================*/
/* Table: sys_login_logs                                        */
/*==============================================================*/
create table sys_login_logs
(
   sys_login_logs_id    varchar(32) not null,
   login_id             varchar(32),
   sys_login_logs_ip    varchar(24),
   sys_login_logs_mac   varchar(24),
   sys_login_logs_systype int,
   sys_login_logs_description text,
   sys_login_logs_create_date timestamp,
   primary key (sys_login_logs_id)
);

/*==============================================================*/
/* Table: sys_menu                                              */
/*==============================================================*/
create table sys_menu
(
   menu_id              int not null,
   menu_father_id       int,
   menu_name            varchar(32),
   menu_type            int,
   menu_controller      varchar(50),
   menu_icon            varchar(32),
   menu_status          int,
   menu_desctiption     text,
   menu_url             varchar(50),
   primary key (menu_id)
);

/*==============================================================*/
/* Table: sys_organization                                      */
/*==============================================================*/
create table sys_organization
(
   org_id               int not null,
   org_fater_id         int,
   org_name             varchar(24),
   org_create_date      timestamp,
   org_description      text,
   primary key (org_id)
);

/*==============================================================*/
/* Table: sys_role                                              */
/*==============================================================*/
create table sys_role
(
   role_id              int not null,
   role_father_id       int,
   role_name            varchar(24),
   role_create_date     timestamp,
   role_description     text,
   primary key (role_id)
);

/*==============================================================*/
/* Table: sys_user                                              */
/*==============================================================*/
create table sys_user
(
   org_id               int,
   user_id              varchar(32) not null,
   user_name            varchar(32),
   user_sex             int,
   user_age             int,
   user_phone           varchar(24),
   user_tel             varchar(24),
   user_email           varchar(24),
   user_status          int,
   user_create_date     timestamp,
   primary key (user_id)
);

/*==============================================================*/
/* Table: user_login                                            */
/*==============================================================*/
create table user_login
(
   login_id             varchar(32) not null,
   user_id              varchar(32),
   login_account        varchar(32),
   login_password       varchar(32),
   login_question       varchar(50),
   login_answer         varchar(50),
   login_status         int,
   login_create_date    timestamp,
   primary key (login_id)
);

alter table authority_menu_relation add constraint FK_Relationship_15 foreign key (sys_authority_id)
      references sys_authority (sys_authority_id) on delete restrict on update restrict;

alter table authority_menu_relation add constraint FK_Relationship_16 foreign key (menu_id)
      references sys_menu (menu_id) on delete restrict on update restrict;

alter table authority_org_relation add constraint FK_Relationship_17 foreign key (org_id)
      references sys_organization (org_id) on delete restrict on update restrict;

alter table authority_org_relation add constraint FK_Relationship_18 foreign key (sys_authority_id)
      references sys_authority (sys_authority_id) on delete restrict on update restrict;

alter table code_data add constraint FK_dictionary_relation foreign key (code_id)
      references sys_code (code_id) on delete restrict on update restrict;

alter table role_authority_relation add constraint FK_Relationship_12 foreign key (sys_authority_id)
      references sys_authority (sys_authority_id) on delete restrict on update restrict;

alter table role_authority_relation add constraint FK_Relationship_13 foreign key (role_id)
      references sys_role (role_id) on delete restrict on update restrict;

alter table role_org_relation add constraint FK_Relationship_5 foreign key (org_id)
      references sys_organization (org_id) on delete restrict on update restrict;

alter table role_org_relation add constraint FK_Relationship_6 foreign key (role_id)
      references sys_role (role_id) on delete restrict on update restrict;

alter table sys_excepetion_logs add constraint FK_sys_excepetion_relation foreign key (login_id)
      references user_login (login_id) on delete restrict on update restrict;

alter table sys_login_logs add constraint FK_login_logs_relation foreign key (login_id)
      references user_login (login_id) on delete restrict on update restrict;

alter table sys_user add constraint FK_org_user_relation foreign key (org_id)
      references sys_organization (org_id) on delete restrict on update restrict;

alter table user_login add constraint FK_user_login_relation foreign key (user_id)
      references sys_user (user_id) on delete restrict on update restrict;

