.source    Person.java
.class     public Person
.super     java/lang/Object
.field     c I
.method    public showOutput()V
   .limit stack    16
   .limit locals    16
   ldc     10
   istore_1
   ldc     70
   ldc     10
   ldc     20
   ldc     30
   iadd 
   ldc     40
   iadd 
   imul 
   iadd 
   ldc     60
   aload_0     
   getfield     Person/c I
   imul 
   ldc     80
   imul 
   iadd 
   istore_2
   getstatic             java/lang/System/out Ljava/io/PrintStream;
   iload              2
   invokevirtual         java/io/PrintStream/println(I)V
return
.end method

.method                  public static main([Ljava/lang/String;)V
   .limit stack    16
   .limit locals    16
return
.end method

.method                  public <init>()V
   .limit stack          1
   .limit locals         1
   .line                 1
   aload_0
   invokespecial         java/lang/Object/<init>()V
   return
.end method

