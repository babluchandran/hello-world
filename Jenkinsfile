//@Library(['git_checkout', 'maven-build', 'maven_project']) _
//e2eMvnProject([repoUrl: "https://github.com/babluchandran/hello-world.git", name: "Bablu"])

@Library(['git_checkout', 'maven-build', 'maven_project']) _

def gitUrl = "https://github.com/babluchandran/hello-world.git"
def project = "JAVA"
def dockerize = "True"

if (project=="JAVA"){
println("The Specifid project is "+ project)
e2eMvnProject([repoUrl: gitUrl, name: "Bablu", dockerize: dockerize])
}
else{
    println("No shared library found for "+ project)
}
	
