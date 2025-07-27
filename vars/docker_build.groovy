
def call(String projectName, String imageTag , String dockerHubUser){
   sh "dokcer build -t "${dockerHubUser}/${projectName}:${inageTag}"
 
}
