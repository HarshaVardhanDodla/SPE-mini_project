pipeline {
    agent any
   stages {
    stage('BUILD') {
  	steps {
       		sh 'mvn clean package -DskipTests'
       	      }
     	}
     stage('TEST'){
     steps{
      sh 'mvn test'
     }
     }
     stage('DOCKER IMAGE'){
     steps{
      sh 'docker build -t harshavardhandodla/di:calimg .'
     }
     }
    stage('PUBLISH TO DockerHub')
 		{
 		    steps
 		    {
 	        	withDockerRegistry([ credentialsId: "DockerHub", url: "" ])
 	        	{
 	        		sh 'docker push harshavardhandodla/di:calimg'

 	      		}
 		    }
 		}
   stage('Deploy to Rundeck') {
     agent any
     steps {
       script {
         step([$class: "RundeckNotifier",
                  includeRundeckLogs: true,
                  jobId: "cbefc2de-a41a-42e3-8719-6648dfacf95b",
                  rundeckInstance: "Rundeck",
                  shouldFailTheBuild: true,
                  shouldWaitForRundeckJob: true,
                  tailLog: true])
        }
      }
   }
   }
 }
