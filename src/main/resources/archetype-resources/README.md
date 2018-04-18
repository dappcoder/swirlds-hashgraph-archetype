Generated with ```swirlds-hashgraph-archetype```.

#### Hashgraph SDK
Make sure Hashgraph SDK is installed in ${swirdSdkPath} as described in https://dev.hashgraph.com/docs/installation/

#### Configure the SDK:
1. change the `config.txt` file found in the SDK as follows:
   * comment the GameDemo.jar line and add a new app line for this application (${appName})
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
```
mvn clean install
```
This will package the app jar and copy it to the `apps` dir inside the Hashgraph sdk.

#### Run from IntelliJ IDEA
1. Run -> Edit Configurations...
2. Add new Application cofiguration
3. Main Class: ${appName}Main
4. Working Directory: ${swirdSdkPath}
5. Press "Run..." or "Debug..."

You should see four console windows and one main browser window.

#### Run from command line
To run it in the usual way, go to hashgraph sdk dir
```
java -jar swirlds.jar
```

NOTE: Every code change needs a `mvn clean install` before you run the app again
