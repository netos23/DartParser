.source                  Simple.java
.class                   public Simple
.super                   java/lang/Object

.field                   c I

.method                  public <init>()V
   .limit stack          2
   .limit locals         1
   .line                 2
   aload_0               
   invokespecial         java/lang/Object/<init>()V
   .line                 5
   aload_0               
   bipush                10
   putfield              Simple/c I
   return                
.end method              

.method                  public show(I)V
   .limit stack          3
   .limit locals         2
   .line                 10
   getstatic             java/lang/System/out Ljava/io/PrintStream;
   iload_1               
   aload_0               
   getfield              Simple/c I
   iadd                  
   invokevirtual         java/io/PrintStream/println(I)V
   .line                 11
   aload_0               
   iload_1               
   iconst_1              
   isub                  
   invokevirtual         Simple/show(I)V
   .line                 12
   aload_0               
   invokevirtual         Simple/rec()V
   .line                 13
   return                
.end method              

.method                  public rec()V
   .limit stack          1
   .limit locals         2
   .line                 16
   iconst_1              
   istore_1              
   .line                 18
   return                
.end method              

.method                  public static main([Ljava/lang/String;)V
   .limit stack          2
   .limit locals         3
   .line                 22
   bipush                -5
   istore_1              
   .line                 24
   new                   Simple
   dup                   
   invokespecial         Simple/<init>()V
   astore_2              
   .line                 25
   aload_2               
   iload_1               
   invokevirtual         Simple/show(I)V
   .line                 26
   return                
.end method              

