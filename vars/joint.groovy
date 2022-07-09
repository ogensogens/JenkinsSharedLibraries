def call(String mavenObj){
  
  if ("${mavenObj}" == "Clean")
     {
       sh "mvn clean"
     }
  else if ("${mavenObj}" == "Compile")
     {
       sh "mvn clean compile"
     }
  else if ("${mavenObj}" == "Test")
     {
       sh "mvn clean test"
     }
   else if ("${mavenObj}" == "Package")
      {
        sh "mvn clean package"
      }
}
