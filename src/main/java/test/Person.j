.source    Person.java
.class     public Person
.super     java/lang/Object
.field   c I
.method                  public <init>()V
   .limit stack          16
   .limit locals         16
   .line                 1
   aload_0
   invokespecial         java/lang/Object/<init>()V
   aload_0
   ldc     10
   putfield Person/c I
   return
.end method

.method    public showOutput()V
   .limit stack    16
   .limit locals    16
   ldc     10
   istore_1
   ldc     70
   ldc     10
   iload     1
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
   istore             2  
   getstatic             java/lang/System/out Ljava/io/PrintStream;
   iload              2
   invokevirtual         java/io/PrintStream/println(I)V
return
.end method

.method                  public static main([Ljava/lang/String;)V
   .limit stack    16
   .limit locals    16
   ldc     12
   istore_1
   iload     1
   ldc     12
   if_icmpne             LABEL0x7
   ldc     14
   istore             2  
   getstatic             java/lang/System/out Ljava/io/PrintStream;
   iload              2
   invokevirtual         java/io/PrintStream/println(I)V
LABEL0x7:
   ldc     70
   ldc     10
   iload     1
   ldc     30
   iadd 
   ldc     40
   iadd 
   imul 
   iadd 
   ldc     60
   iload     1
   imul 
   ldc     80
   imul 
   iadd 
   istore             2  
   getstatic             java/lang/System/out Ljava/io/PrintStream;
   iload              2
   invokevirtual         java/io/PrintStream/println(I)V
return
.end method

