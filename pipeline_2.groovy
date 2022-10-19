

job('pipe2') {
   triggers
  {
    upstream("pipe1",'SUCCESS')
  }
    logRotator(10)
     
    steps {
         
         shell('''
             mvn -v
              touch test''')
         }
}
