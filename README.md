# Swirlds Hashgraph Maven Archetype

### Description
Generate maven modules for Hashgraph applications using ```swirlds-hashgraph-archetype```.

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
To run the generated app, follow the README.md inside the newly generated module. You will need to make a small config to the SDK (more details there).
