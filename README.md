# Aproximación de Pi mediante el método de Montecarlo

Este proyecto proporciona una implementación en Java para generar una aproximación al número Pi utilizando el método de Montecarlo con recursividad.

## Descripción

El método de Montecarlo es una técnica de simulación estadística que se basa en la generación de números aleatorios para resolver problemas determinísticos mediante la aproximación de soluciones numéricas.

En este caso, la aproximación de Pi se realiza generando puntos aleatorios dentro de un cuadrado unitario y contando cuántos de estos puntos caen dentro de un círculo inscrito en el cuadrado. La relación entre la cantidad de puntos dentro del círculo y el total de puntos generados se utiliza para estimar el valor de Pi mediante un algoritmo recursivo.

## Documentacion
Proyecto creado por Carlota Ruiz Campesino Version1.0 Fecha de creación 28/02/2024.

## Instalación
Clona este repositorio a tu máquina local utilizando el siguiente comando:
git clone https://github.com/carlotacrc/Practica2.git

## Cómo Iniciar la Aplicación
1. Compila todas las clases presentes en el proyecto.
2. Ejecuta la clase Principal, la cual contiene el método main.
3. Sigue las indicaciones para llevar a cabo las operaciones deseadas.

## Instrucciones de Uso

1. Clone este repositorio en su máquina local.
2. Abra el proyecto en su entorno de desarrollo preferido (por ejemplo, IntelliJ IDEA, Eclipse, etc.).
3. Ejecute el archivo `Principal.java` ubicado en el paquete `aplicacion`.
4. Pase el número de pasos como argumento al programa.

Ejemplo de uso:
java aplicacion.Principal 1000

## Estructura del Proyecto

- La carpeta src: Contiene el código fuente del proyecto.
  - El paquete mates: Contiene la clase `Matematicas` que implementa el método de Montecarlo para generar una aproximación de Pi.
  - El paquete aplicacion: Contiene la clase `Principal` que contiene el método `main` para ejecutar el programa y mostrar el resultado.
- README.md: Documentación del proyecto que explica su funcionamiento, estructura y uso.
- LICENSE: Archivo de licencia del proyecto que especifica los términos de uso y distribución.
- .gitignore: Archivo que especifica qué archivos y directorios se deben ignorar en el control de versiones Git.

## Dependencias

JDK 8 o superior.

## Licencia

Copyright 2024 © Carlota Ruiz Campesino Este proyecto está bajo la licencia [LICENSE].

## Contacto

Para consultas y comentarios contactar a Carlota Ruiz Campesino. Correo: carlota.ruizcampesino@usp.ceu.es Telefono: 628791353.