create database clinica;
use clinica;

CREATE TABLE empleados (
  DNI varchar(15) NOT NULL,
  Nombre varchar(45) NOT NULL,
  Apellidos varchar(45) NOT NULL,
  Telefono int(11) NOT NULL,
  Contraseña varchar(45) NOT NULL,
  CuentaBancaria int(20) NOT NULL,
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
  Dirección varchar(45) NOT NULL,
  FechaIngreso varchar(45) NOT NULL,
  FechaNacimiento varchar(45) NOT NULL,
  FechaUltimaVisita varchar(45) NOT NULL,
  Mascotas varchar(200) NOT NULL,
  Deuda float(10clinicaclientes) NOT NULL,
  PRIMARY KEY (DNI),
  UNIQUE KEY DNI_UNIQUE (DNI),
  UNIQUE KEY FechaUltimaVisita_UNIQUE (FechaUltimaVisita)
) ;

CREATE TABLE mascotas (
  NumeroChip varchar(15) NOT NULL,
  Nombre char(20) NOT NULL,
  TipoMascota char(30) NOT NULL,
  Raza char(40) NOT NULL,
  DNICliente varchar(15) NOT NULL,
  Peso float(5) NOT NULL,
  Edad int(11) NOT NULL,
  PRIMARY KEY (NumeroChip),
  UNIQUE KEY NumeroChip_UNIQUE (NumeroChip),
  KEY DNICliente_idx (DNICliente),
  CONSTRAINT DNICliente FOREIGN KEY (DNICliente) REFERENCES cliente (DNI) ON DELETE NO ACTION ON UPDATE NO ACTION
); 

CREATE TABLE medicamentos (
  CodigoMedicamento int(11) NOT NULL,
  NombreTecnico varchar(50) NOT NULL,
  CantidadMedicamento varchar(45) NOT NULL,
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
  CONSTRAINT Auxiliar FOREIGN KEY (DNIAuxiliar) REFERENCES auxiliar (DNIAuxiliar) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT Cliente FOREIGN KEY (DNICliente) REFERENCES cliente (DNI) ON DELETE NO ACTION ON UPDATE NO ACTION
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
  CONSTRAINT Chip FOREIGN KEY (NumeroChipMascota) REFERENCES mascota (NumeroChip) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT Medicamento FOREIGN KEY (CodigoMedicamento) REFERENCES medicamentos (CodigoMedicamento) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT Veterinario FOREIGN KEY (DNIVeterinario) REFERENCES veterinario (DNIVeterinarioauxclien) ON DELETE NO ACTION ON UPDATE NO ACTION
) ;