create database clinica;
use clinica;

CREATE TABLE empleados (
  DNI varchar(15) NOT NULL,
  Nombre varchar(45) NOT NULL,
  Apellidos varchar(45) NOT NULL,
  Telefono int(11) NOT NULL,
  Contraseña varchar(45) NOT NULL,
  CuentaBancaria varchar(20) NOT NULL,
  Tipo char(20) NOT NULL,
  PRIMARY KEY (DNI),
  UNIQUE KEY DNI_UNIQUE (DNI)
);

CREATE TABLE empleadosauxiliar (
  DNIAuxiliar varchar(15) NOT NULL,
  PRIMARY KEY (DNIAuxiliar),
  UNIQUE KEY DNIAuxiliar_UNIQUE (DNIAuxiliar),
  CONSTRAINT DNIAuxiliar FOREIGN KEY (DNIAuxiliar) REFERENCES empleados (DNI) ON DELETE NO ACTION ON UPDATE NO ACTION
);

CREATE TABLE veterinario (
  DNIVeterinario varchar(15) NOT NULL,
  PRIMARY KEY (DNIVeterinario),
  UNIQUE KEY DNIVeterinario_UNIQUE (DNIVeterinario),
  CONSTRAINT DNIVeterinario FOREIGN KEY (DNIVeterinario) REFERENCES empleados (DNI) ON DELETE NO ACTION ON UPDATE NO ACTION
);

CREATE TABLE clientes (
  DNI varchar(15) NOT NULL,
  Nombre char(20) NOT NULL,
  Apellidos char(45) NOT NULL,
  Telefono int(11) NOT NULL,
  Dir varchar(45) NOT NULL,
  FechaIngreso varchar(45) NOT NULL,
  FechaNacimiento varchar(45) NOT NULL,
  FechaUltimaVisita varchar(45) NOT NULL,
  Mascotas varchar(50) NOT NULL,
  Deuda float(10) NOT NULL,
  PRIMARY KEY (DNI),
  UNIQUE KEY DNI_UNIQUE (DNI),
  UNIQUE KEY FechaUltimaVisita_UNIQUE (FechaUltimaVisita)
) ;

CREATE TABLE mascotas (
  NumeroChip int(11) NOT NULL,
  Nombre char(20) NOT NULL,
  TipoMascota char(30) NOT NULL,
  Raza char(40) NOT NULL,
  DNICliente varchar(15) NOT NULL,
  Peso float(5) NOT NULL,
  Edad int(11) NOT NULL,
  Especie char(40) NOT NULL,
  PRIMARY KEY (NumeroChip),
  UNIQUE KEY NumeroChip_UNIQUE (NumeroChip),
  KEY DNICliente_idx (DNICliente),
  CONSTRAINT DNICliente FOREIGN KEY (DNICliente) REFERENCES clientes (DNI) ON DELETE NO ACTION ON UPDATE NO ACTION
); 

CREATE TABLE medicamentos (
  CodigoMedicamento int(11) NOT NULL,
  NombreTecnico varchar(50) NOT NULL,
  CantidadMedicamento int(11) NOT NULL,
  PrincipiosActivos varchar(45) NOT NULL,
  PRIMARY KEY (CodigoMedicamento),
  UNIQUE KEY CodigoMedicamento_UNIQUE (CodigoMedicamento),
  UNIQUE KEY NombreTecnico_UNIQUE (NombreTecnico)
);

CREATE TABLE auxclien (
  DNIAuxiliar varchar(15) NOT NULL,
  DNICliente varchar(15) NOT NULL,
  FechaVisita varchar(45) NOT NULL,
  PRIMARY KEY (DNIAuxiliar),
  UNIQUE KEY DNICliente_UNIQUE (DNICliente),
  UNIQUE KEY DNIAuxiliar_UNIQUE (DNIAuxiliar),
  UNIQUE KEY FechaVisita_UNIQUE (FechaVisita),
  CONSTRAINT Auxiliar FOREIGN KEY (DNIAuxiliar) REFERENCES empleadosauxiliar (DNIAuxiliar) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT Cliente FOREIGN KEY (DNICliente) REFERENCES clientes (DNI) ON DELETE NO ACTION ON UPDATE NO ACTION
);

CREATE TABLE vetclien (
  DNIVeterinario varchar(15) NOT NULL,
  DNICliente varchar(15) NOT NULL,
  FechaVisita varchar(45) NOT NULL,
  PRIMARY KEY (DNIVeterinario),
  UNIQUE KEY DNIVeterinario_UNIQUE (DNIVeterinario),
  UNIQUE KEY FechaVisita_UNIQUE (FechaVisita),
  UNIQUE KEY DNICliente_UNIQUE (DNICliente),
  CONSTRAINT DNIVet FOREIGN KEY (DNICliente) REFERENCES veterinario (DNIVeterinario) ON DELETE NO ACTION ON UPDATE NO ACTION
);

CREATE TABLE mascomedicaveter (
  NumeroChipMascota int(11) NOT NULL,
  CodigoMedicamento int(11) NOT NULL,
  PrincipiosActivos varchar(45) NOT NULL,
  DNIVeterinario varchar(15) NOT NULL,
  CantidadRestante varchar(45) NOT NULL,
  PRIMARY KEY (NumeroChipMascota),
  UNIQUE KEY NumeroChipMascota_UNIQUE (NumeroChipMascota),
  UNIQUE KEY CodigoMedicamento_UNIQUE (CodigoMedicamento),
  KEY Veterinario_idx (DNIVeterinario),
  CONSTRAINT Chip FOREIGN KEY (NumeroChipMascota) REFERENCES mascotas (NumeroChip) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT Medicamento FOREIGN KEY (CodigoMedicamento) REFERENCES medicamentos (CodigoMedicamento) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT Veterinario FOREIGN KEY (DNIVeterinario) REFERENCES veterinario (DNIVeterinario) ON DELETE NO ACTION ON UPDATE NO ACTION
) ;

INSERT INTO empleados VALUES('77777777A', 'Rafa', 'Mejido', 999888777, 'alpaca',444433322, 'Veterinario');
INSERT INTO empleados VALUES('88888888B', 'Josefa', 'J. ', 666555444, 'remo',555553331, 'Auxiliar');
INSERT INTO empleados VALUES('99999999C', 'Ramon', 'Smith', 333222111, 'ramon', 666666122, 'Auxiliar');

INSERT INTO clientes VALUES('12312312D', 'Ernesto', ' ', 987987654, 'Calle arriba', '01-01-11', '02-02-89', '03-01-18', '9999, 8888', 0);
INSERT INTO clientes VALUES('32132321E', 'Marta', ' ', 789786721, 'Calle abajo', '10-02-11', '05-12-72', '04-01-18', '1111', 10);

INSERT INTO mascotas VALUES('9999', 'Bruno', 'Hospitalizado', 'Mastin Leonés', '12312312D', 100, 6, 'Perro');
INSERT INTO mascotas VALUES('8888', 'Agata', 'Sano', 'Persa', '12312312D', 4, 3, 'Gato');
INSERT INTO mascotas VALUES('7777', 'Mimi', 'Tratamiento', 'Africano', '32132321E', 1, 1, 'Erizo');

INSERT INTO medicamentos VALUES('6666', 'Alprazolam', 20, 'A12, B2, C14');
INSERT INTO medicamentos VALUES('5555', 'Reinumol', 5, 'B2, D1');