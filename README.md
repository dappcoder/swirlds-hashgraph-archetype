# Swirlds Hashgraph Maven Archetype

Maven archetype that generates maven modules for Hashgraph applications.

This is a template for an alternative (arguably friendlier) setup for Hashgraph SDK based applications. It allows you to build and run hashgraph apps using the SDK more like an external resource rather than creating new modules along the demo apps inside the SDK directory structure.

### Install Hashgraph SDK
Follow the pre-requisites to correctly install the SDK provided by Swirlds: https://dev.hashgraph.com/docs/installation

### Archetype Installation

Clone this repo to your preferred location, then:

```
mvn install
```

### Generate Your (D)App

```cd``` to your prefered location, fill in placeholders below and copy-paste to the command line.

```
mvn archetype:generate                                  \
    -DarchetypeGroupId=com.dappcoder                    \
    -DarchetypeArtifactId=swirlds-hashgraph-archetype   \
    -DarchetypeVersion=1.0-SNAPSHOT                     \
    -DgroupId= < org.decentralized >                    \
    -DartifactId= < mydapp >                            \
    -Dversion= < 1.0-SNAPSHOT >                         \
    -Dpackage= < org.decentralized.mydapp >             \
    -DappName= < MyDapp >                               \
    -DswirdSdkPath= < /home/swirlds/sdk >
```
NOTE: ```swirldsSdkPath``` must point to the Swirlds SDK directory where you find ```config.txt``` and ```swirlds.jar``` files.

You can now import the module into your preferred IDE or just take a look at what has been generated in the directory named after your ```artifactId```.

### Run It
To run the generated app, follow the steps below. You will find the same info in the README.md inside the newly generated module.

#### Configure the SDK:
Change the `config.txt` file found in the SDK as follows:
   * comment the GameDemo.jar line and add a new app line for this application (replace ${appName} with your chosen value above)
```
...
# app,		GameDemo.jar,		   9000, 9000
app,        ${appName}.jar
...
```
   * For now, switch off the TLS encryption for a faster startup. You can come back and revert this change later. Just uncomment the line:
```
TLS, off
```

#### Build it
```cd``` into the generated module.
```
mvn clean install
```
This will package the app jar and copy it to the `apps` dir inside the Hashgraph sdk.

#### Run from IntelliJ IDEA
Replace ${appName} and ${swirdSdkPath} placeholders with your chosen values above.
```
1. Run -> Edit Configurations...
2. Add new Application cofiguration
3. Main Class: ${appName}Main
4. Working Directory: ${swirdSdkPath}
5. Press "Run..." or "Debug..."
```

You should see four console windows and one main browser window.

#### Run from command line
To run it in the usual way, go to hashgraph sdk dir
```
java -jar swirlds.jar
```

NOTE: Every code change needs a `mvn clean install` before you run the app again

