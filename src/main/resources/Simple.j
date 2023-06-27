.source                  Simple.java
.class                   public Simple
.super                   java/lang/Object

.field                   a I
.field                   c I

.method                  public <init>()V
   .limit stack          1
   .limit locals         1
   .line                 1
   aload_0               
   invokespecial         java/lang/Object/<init>()V
   return                
.end method              

.method                  public showOutput()V
   .limit stack          2
   .limit locals         2
   .line                 8
   bipush                20
   istore_1              
   .line                 9
   getstatic             java/lang/System/out Ljava/io/PrintStream;
   aload_0               
   getfield              Simple/a I
   invokevirtual         java/io/PrintStream/println(I)V
   .line                 10
   return                
.end method              

.method                  public static main([Ljava/lang/String;)V
   .limit stack          0
   .limit locals         1
   .line                 14
   return                
.end method              

