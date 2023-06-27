.source    Person.java
.class     public Person
.super     java/lang/Object
.field     a I
.method    public showOutput()V
   .limit stack    16
   .limit locals    16
   bipush    20
   istore_1
   aload_0
   bipush    10
   putfield              Person/a I   
   getstatic             java/lang/System/out Ljava/io/PrintStream;
   aload              0
   getfield              Person/a I
   invokevirtual         java/io/PrintStream/println(I)V
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

