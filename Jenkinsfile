//@Library(['git_checkout', 'maven-build', 'maven_project']) _
//e2eMvnProject([repoUrl: "https://github.com/babluchandran/hello-world.git", name: "Bablu"])

@Library(['git_checkout', 'maven-build', 'maven_project']) _

def project = "JAVA"
def dockerize = "True"

if (project=="JAVA"){
e2eMvnProject([repoUrl: "https://github.com/babluchandran/hello-world.git", name: "Bablu"])
}
else{
    println("No shared library found for "+ project)
}
	
