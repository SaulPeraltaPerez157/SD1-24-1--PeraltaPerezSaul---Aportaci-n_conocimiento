# Hilos en Java.

Para crear un sistema multihilos en java se utiliza la clase **Thread**, los métodos de dicha clase, así como la
interfaz **Runnable**. Para crear un nuevo hilo se debe crear una clase hija de la clase Thread o implementar la 
interfaz Runnable.

## La clase Thread.

La clase **Thread** define varios métodos que ayudan al manejo de los hilos. Para poder hacer uso de multiples hilos 
se tiene que considerar la creación de un ***hilo principal***.

### Hilo principal (Main Thread).

Cuando inicia la ejecución de un programa en Java, inmediatamente comienza la ejecución de un hilo el cual se le llama
***hilo principal***. Este hilo tiene las siguientes características.

- Es el hilo donde los hilos hijos son generados.
- Regularmente debe ser el último en terminar de ejecutarse, debido a que realiza varias operaciones cuando finaliza la ejecución
de un programa en Java.

El hilo principal puede ser controlado con un objeto de la clase Thread, se debe obtener la referencia a través del 
método <code>currentThread()</code>, este método tiene la siguiente definición.

> <code>static Thread currentThread()</code>

Este método regresa una referencia al hilo en el cual es llamado dicho método.

Un ejemplo del uso de este método, así como control del hilo principal se encuentra en el archivo <code>HiloPrincipal.java</code>
