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

Un ejemplo del uso de este método, así como control del hilo principal se encuentra en el archivo <code>HiloPrincipal/HiloPrincipal.java</code>

#### Observaciones sobre el programa.

Cuando se coloca el objeto <code>t</code> en un <code>println()</code> se imprime una salida parecida a una lista.

> <code>Hilo actual: Thread[main,5,main]</code> 

Observar la estructura de la lista, el primer elemento es el nombre del hilo, el segundo elemento es la prioridad
y el tercer elemento es el nombre del grupo al que pertenece.

> <code>Hilo actual: Thread[<nombre_hilo>,<hilo_prioridad>,<nombre_grupo_hilo>]</code>

Cuando se utiliza el método <code>setName(String name)</code> se modifica el nombre del hilo principal
obteniendo la siguiente salida.

> <code>Despues del cambio de nombre: Thread[Mi hilo,5,main]</code>

El método <code>sleep(long milis)</code> hace que la ejecución de un hilo se detenga durante el número de milisegundos
que se le pasa como parámetro. Este parámetro puede lanzar una excepción <code>InterruptedException</code>.

### Creando un hilo.

En casos generales un hilo puede crearse creando una instancia de la clase <code>Thread</code>. Java
ofrece dos formas de realizar dicha tarea.

- Implementando la interfaz **Runnable**.
- Heredando la clase **Thread**.

#### Implementando la interfaz Runnable.

Para implementar la interfaz Runnable, una clase necesita implementar el método <code>run()</code>, dentro
de dicho método se define el código que ejecutara el nuevo hilo, el método <code>run()</code> puede utilizar
otras clases, llamar a otros métodos, y declarar variables, la ejecución del nuevo hilo termina cuando 
se ejecutan todas las intrucciones del método <code>run()</code>.

Una vez que se ha implementado la interfaz Runnable, se instancia un objeto de la clase Thread dentro de la
misma clase, uno de los constructores a utilizar puede ser el siguiente.

> Thread(Runnable hilo, String nombre_hilo)

Para iniciar la ejecución de un hilo, se debe ejecutar el método <code>start()</code>.

En el directorio llamado <code>Thread_R</code>, se encuentra un ejemplo sobre la implementación de este método.

##### Observaciones sobre el programa.

- Observar que el tiempo que el hilo principal duerme es mayor que el tiempo que el hilo hijo duerme.
- Se debe llamar al método <code>start()</code> para que comienze la ejecución del hilo. 

#### Heredando la clase Thread.

Se debe crear una nueva clase que herede de la clase Thread, y crear una instancia de la nueva clase
en esta nueva clase se debe sobreescribir el método <code>run()</code>. También se debe llamar al método
<code>start()</code> para empezar con la ejecución del nuevo hilo.

En el directorio <code>Thread_T</code> se encuentra el mismo programa que se encuentra en el directorio <code>Thread_R</code> solo
que ahora se utiliza este método.
