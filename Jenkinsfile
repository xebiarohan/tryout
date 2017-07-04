node {
    stage 'Checkout'
    checkout scm

    stage 'Build'
      def mvnHome = tool 'M3'
      buildStatus= sh returnStatus: true, script:"${mvnHome}/bin/mvn clean package" 
      echo "Build status : ${buildStatus}"
    stage 'Record JUnit Results'
      junit 'target/surefire-reports/*.xml'
    stage 'Record Jacoco Results'
      jacoco
} 
