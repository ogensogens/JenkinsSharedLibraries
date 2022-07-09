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
       sh "mvn sonar:sonar"
     }
   else if ("${mavenObj}" == "Package")
      {
        sh "mvn clean package"
     }
  else if ("${mavenObj}" == "Backup")
      {
        sh "mvn deploy"
     }
}
