create table account(
id bigserial primary key not null,
code varchar(255) not null,
balance numeric(15,4) not null,
withdraw int not null,
rate numeric(15,4)
);

create table extract(
id bigserial primary key not null,
entrance numeric(15,4) not null,
exit numeric(15,4) not null,
balance numeric(15,4) not null,
description varchar(255) not null,
moviment_date timestamp not null,
account_id bigserial not null,
constraint fk_account foreign key (account_id) references account (id)
);

