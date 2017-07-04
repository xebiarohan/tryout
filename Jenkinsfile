node {
    stage 'Checkout'
    checkout scm

    stage 'Build'
    def mvnHome = tool 'M3'
    buildStatus= sh returnStatus: true, script:"${mvnHome}/bin/mvn clean package" 
    echo "Build status : ${buildStatus}"
    stage 'Analyze Test Results'
    jacoco classPattern: 'target/classes', execPattern: 'target/coverage-reports/*.exec'
} 
