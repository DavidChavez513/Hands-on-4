# Aplicación de cálculo diferencial a Machine Learning - Hands on 4

### Entrada de datos

- Hardcodear los datos de entrada en el código

- Inyectar el valor de entrada desde la terminal al ejecutar el programa



### Salida de datos

- Imprimir la ecuación de la regresíon lineal en la terminal reemplazando los valores optimos para la siguiente ecuación $ \hat{y} = \beta_0 + \beta_1x_1 $
- Imprimir los resultados en la terminal
- A patir de un valor X de entrada, predecir el valor de Y


## Diagrama de clases UML

Este programa estara desarrollado en Java, por lo que se utilizara el siguiente diagrama de clases UML para representar la estructura del programa.

```plantuml

@startuml

interface DiscretMaths {
    + DiscretMaths() // Constructor
    + RiemmanSum(double[] data): return double
    + multiply(double[][] dataMatrix): return double
    + factorial(int n): return int
    + combination() : return int // Pendiente de uso
    + permutation(): return int
}

class DataSet {
    - data: int[][]
    + getDataMatrix(): return int[][]
}

interface LinearAlgebra {
    + LinearAlgebra()
    + getRow(double[][] matrix) : return double[]
    + getColumn(double[][] matrix) : return double[]
    + determinant(double[][] matrix) : return double [][]
    + inverse(double[][] matrix): return double[][]
    + transpose(double[][] matrix): return double[][]
    + minor(double[][] matrix, int row, int column): return double[][]

    + cramerResolution() : return double[][]
    + gaussJordanResolution() : return double[][]
    + powVector(double[] vector, int pow): return double[]

}

class LinearRegression {
    - dataSet: DataSet
    - error: double
    - beta0: double
    - beta1: double
    - earring: double
    + LinearRegression()
    + calculateBeta0(): return double
    + calculateBeta1(): return double
    + calculateYHat(): return double
    + predict(): return double
    + calculateError(): return double
    + getError(): return double
    + getBeta0(): return double
    + getBeta1(): return double
    + getEarring(): return double
    + toString(): return String
}

class Main {
    + main()
}

DiscretMaths <-- LinearRegression
LinearAlgebra<-- LinearRegression

DataSet <-- LinearRegression
LinearRegression --> Main


@enduml
```

## Caso a analizar

El caso en el que vamos a trabajar es el caso de la empresa Benneton, para calculas sus ventas respectos a sus gastos en publicidad a lo largo de 9 años y poder generar una predicción de ventas para años posteriores.