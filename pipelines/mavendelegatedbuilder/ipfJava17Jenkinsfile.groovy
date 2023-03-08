library identifier: 'mavenPipelines@master', retriever: modernSCM([$class: 'GitSCMSource',
remote: 'https://ghe.service.group/PFFC/JENKINS-Maven-Pipelines.git', credentialsId: 'jenkinsGHEPAT'])
library identifier: 'sharedPipelines@master', retriever: modernSCM([$class: 'GitSCMSource',
remote: 'https://ghe.service.group/PFFC/JENKINS-Shared-Pipelines.git', credentialsId: 'jenkinsGHEPAT'])
library identifier: 'java-maven-build_nix@master', retriever: modernSCM ([$class: 'GitSCMSource',
remote: 'https://ghe.service.group/PFFC/java-maven-build_nix.git', credentialsId: 'jenkinsGHEPAT'])
library identifier: 'nexus-upload-artifact@master', retriever: modernSCM ([$class: 'GitSCMSource',
remote: 'https://ghe.service.group/PFFC/nexus-upload-artifact.git', credentialsId: 'jenkinsGHEPAT'])
library identifier: 'GHELibrary@master', retriever: modernSCM ([$class: 'GitSCMSource',
remote: 'https://ghe.service.group/PFFC/JENKINS-GHE-Library.git', credentialsId: 'jenkinsGHEPAT'])
library identifier: 'jiraLibrary@master', retriever: modernSCM ([$class: 'GitSCMSource',
remote: 'https://ghe.service.group/PFFC/JENKINS-Jira-Library.git', credentialsId: 'jenkinsGHEPAT'])
library identifier: 'gitflowEnablers_multi@master', retriever: modernSCM ([$class: 'GitSCMSource',
remote: 'https://ghe.service.group/PFFC/gitflowEnablers_multi.git', credentialsId: 'jenkinsGHEPAT'])
library identifier: 'teamslibrary@master', retriever: modernSCM([$class: 'GitSCMSource',
remote: 'https://ghe.service.group/PFFC/JENKINS-MSTeams-Library.git', credentialsId: 'jenkinsGHEPAT'])

"mavenDelegated${buildTypeByBranch(env.BRANCH_NAME)}"("ipfproject", "17")