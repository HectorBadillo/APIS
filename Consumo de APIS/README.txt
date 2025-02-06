# API con Flask y FakerAPI

Este proyecto es una API en Python con Flask que consume datos falsos de fakerapi.it. Se conectan tres endpoints distintos para obtener información de personas, tarjetas y direcciones.

## Requisitos

Antes de ejecutar el proyecto, asegúrate de tener instalado:

- Python 3.x
- pip (gestor de paquetes de Python)
- Entorno virtual (opcional, pero recomendado)

## Instalación y Ejecución

### 1. Crear y activar un entorno virtual (opcional pero recomendado)

python3 -m venv venv
source venv/bin/activate  # En macOS/Linux

### 2. Instalar dependencias

pip install -r requirements.txt

### 3. Ejecutar la API

python faker-APIS.py

### 4. Probar los Endpoints

Una vez que el servidor está en ejecución, puedes probar los siguientes endpoints:

| Endpoint       | Descripción              | URL Local                        |
|----------------|--------------------------|----------------------------------|
| /personas     | Obtiene datos de personas falsas | http://127.0.0.1:5000/persona |
| /tarjetas       | Obtiene tarjetas falsos         | http://127.0.0.1:5000/tarjeta   |
| /direcciones     | Obtiene datos de direcciones falsas | http://127.0.0.1:5000/address |

También puedes probar con curl:

curl http://127.0.0.1:5000/personas

## Estructura del Proyecto

mi_api/
│── app.py            # Código principal de la API
│── requirements.txt  # Dependencias del proyecto
│── .gitignore        # Archivos y carpetas ignoradas en Git
│── README.txt         # Documentación del proyecto

## Tecnologías utilizadas

- Flask → Framework para crear la API
- Requests → Para consumir fakerapi.it
- Python → Lenguaje de programación

## Autor

- Badillo Dominguez Hector Francisco - Estudiante de Matemáticas Aplicadas y Computación en la UNAM
