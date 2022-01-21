create table cozinha (
	id long not null auto_increment,
	nome varchar(60) not null,
	data_nascimento long not null,
	
	primary key (id)
) engine=InnoDB default charset=utf8;

	