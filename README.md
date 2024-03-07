# Facarta.com

Es un proyecto que busca impulsar negocios locales y hacer una red de socios que puedan iniciar sus emprendimientos de manera facil y amigable. 

![Logo](https://elasticbeanstalk-us-east-1-148301147089.s3.amazonaws.com/facartalogo.png)

## Requisitos

- Java Development Kit (JDK) 17
- Maven
- Base de datos compatible con Spring Boot (PostgreSQL)


## Installation

nvm clean install 



## Run Locally

Clone the project

```bash
  git clone https://github.com/Natams7526/backendLbda.git
```

Go to the project directory

```bash
  cd bk-lbda-main
```

Install dependencies

```bash
  mvn clean Install
```

Construye El Proyecto

```bash
  mvn build
```
Compila el proyecto

```bash
  mvn clean package
```
Ejecuta la aplicación

```bash
  java -jar target/sistema-reserva-citas.jar
```
Accede a la aplicación en tu navegador web

```bash
  http://localhost:8080
```
## Funcionalidades

Funcionalidades para el Cliente:
Registro de Cliente:

Los clientes pueden registrarse en la plataforma proporcionando su número de teléfono como identificador único.

Reservar Cita:

Los clientes pueden reservar una cita seleccionando la fecha y hora deseada.

Cancelar Cita:

Los clientes pueden cancelar una cita previamente reservada si es necesario.

Editar Cita:

Los clientes pueden editar una cita existente para cambiar la fecha o hora, si hay disponibilidad.

Consultar Cita:

Los clientes pueden consultar todas las citas que han reservado, junto con los detalles de cada cita.

Botón de WhatsApp:

Cada cita tiene un botón de WhatsApp que permite al cliente comunicarse directamente con el negocio para cualquier consulta o cambio de cita.


Funcionalidades para el Administrador/Socio:

Acceso al Master del Negocio:

Los administradores o socios tienen acceso completo al sistema para editar, cancelar o crear citas.

Editar Cita:

Los administradores o socios pueden editar cualquier cita existente en el sistema para realizar cambios según sea necesario.

Cancelar Cita:

Los administradores o socios pueden cancelar cualquier cita programada si es necesario.

Crear Cita:

Los administradores o socios pueden crear nuevas citas en nombre de los clientes, si se hace una reserva por teléfono o en persona.

Consultar Todas las Citas:

Los administradores o socios pueden ver todas las citas programadas en el sistema, independientemente del estado (activas o canceladas).

Filtrar Citas:

Los administradores o socios pueden filtrar las citas por fecha o por barbero, lo que facilita la gestión y programación.

Consultar Citas Canceladas y Activas:

Los administradores o socios pueden ver las citas canceladas y activas por separado, lo que proporciona una visión clara de la programación del negocio.


## Badges

Add badges from somewhere like: [shields.io](https://shields.io/)

[![MIT License](https://img.shields.io/badge/License-MIT-green.svg)](https://choosealicense.com/licenses/mit/)
[![GPLv3 License](https://img.shields.io/badge/License-GPL%20v3-yellow.svg)](https://opensource.org/licenses/)
[![AGPL License](https://img.shields.io/badge/license-AGPL-blue.svg)](http://www.gnu.org/licenses/agpl-3.0)
