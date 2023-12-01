# Problema del productor-consumidor en Java.

En el directorio <code>Productor_Consumidor</code> se encuentra un programa realizado en Java que muestra
como darle solución a este problema.

## Explicación básica sobre el problema.

Se tienen dos entidades un ***productor*** y un ***consumidor***, el objetivo es que el productor produzca ciertos paquetes
que seran consumidos por el consumidor, sin embargo, el productor no puede seguir produciendo hasta que el 
consumidor consuma y el consumidor no puede consumir hasta que el productor produzca.

El productor puede guardar los paquetes generados en un buffer, pero si este buffer está lleno el productor
no puede seguir produciendo, así como si no hay nada en el buffer el consumidor no puede consumir.

## Observaciones al programa.

Se crea una clase llamada <code>Q</code> el cual implementa el método del productor con el método <code>put(int dato)</code>
y el método del consumidor con el método <code>get()</code>, en las clase llamada productor se utiliza 
el método <code>put(int dato)</code> y en la clase llamada consumidor se utiliza el método <code>get()</code>.

Un hilo representará al productor y otro hilo representará al consumidor, se utiliza el método <code>wait()</code> 
para que uno de los hilos se detenga hasta que el otro hilo ejecute el método <code>notify()</code>.
Esto se realiza con la finalidad de que el consumidor no intente consumir hasta que el productor haya producido
algo.
 

