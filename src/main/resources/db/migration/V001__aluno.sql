create table aluno (
  id bigint not null auto_increment,
  nome varchar(60) not null,
  data_nascimento timestamp not null,
  
  
  primary key (id)
) engine=InnoDB default charset=utf8;