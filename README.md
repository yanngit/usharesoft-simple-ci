# Simple CI
Just a basic repo to play with Jenkins, Docker and Maven

# What you have to do

1. Fork our project on your GitHub.

This project is a simple Maven project doing some stuff.
Your goal is to:

2. Have a look at it and try to run it
3. You can also try to run the perfect tests

Now that you have launched them, you want to run them automatically using Jenkins.
In the **jenkins-dockerized** folder you will find a simple Dockerfile. You can use it (and Google) to start a Jenkins on your computer.
Your goal here is:

4. Build the provided Dockerfile
5. Run the image
6. Configure Jenkins to build from your GitHub project
7. Run a build (but a broken one ...)

You may have noticed than the program is a bit "broken".
Now that you can run your Jenkins on-demand, your goal is to:

8. Fix the main program
9. Fix the tests
10. Add more tests
11. Run your Jenkins again to check that everything is now working

If you're a BOSS you can then ...

10. Modify Dockerfile to install automatically some plugins (github integration, javadoc, test coverage ...)
11. Modify Dockerfile to persist Jenkins data on your localhost

# How to launch the Jenkins CI

We are going to run a local Jenkins with Docker ! This will allow us to have an up and running CI in less than 2 minutes ... depending on the network !
Don't hesitate to search on the internet to achieve your goal, and you can of course ask us for some help !

## Build a jenkins image
Firstly we need to build the docker image that we are going to use. Sources are inside **jenkins-dockerized** folder.

## Run jenkins locally using docker
### Run jenkins container
Now that the docker image is ready to use we can launch it ! Don't forget to redirect the `8080` port for the web interface ...

### Visit jenkins web interface
Now that jenkins is running we can access the web interface by visiting `localhost:8080` address. Since the jenkins is not initialized you will have to unlock it as said in the interface. To do so we need to run a command inside the running container to get the key without stopping its execution ... easy with docker !

### Jenkins customization
Once jenkins is unlocked, you have to choose the list of plugins you want to install. If you have some plugins you're in love click on **Select plugins to install** and install them otherwise click on **Install suggested plugins**. Wait for the installation and create the first admin account with username and password **root**, we don't care it's local and nobody have access ... for the moment !

### Connect to github
- install the **GitHub Integration** plugin
- setup jdk and maven
- setup GitHub server connection
- create a freestyle project with a simple execution of `clean install` by maven on your GitHub project
- run the job by hand or periodically
