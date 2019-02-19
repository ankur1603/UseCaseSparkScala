# UseCaseSparkScala
Use case given by SG for the SPARK training

A simple project illustrating a spark example using dataframes and RDDs.
Using some key features provided by Scala
1. Implicits
2. Stackable modifications
3. Case Classes

=================================================================================

To run the program use following command

spark-submit --master local[*]  --class com.socgen.usecase.main.UseCaseMain / < Path to generated jar file > /UseCase-0.0.1-SNAPSHOT.jar / < Path to auth.csv file > /auth.csv
