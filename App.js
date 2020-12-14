/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 * @flow strict-local
 */

import React from 'react';
import {
  SafeAreaView,
  StyleSheet,
  ScrollView,
  View,
  Text,
  StatusBar,
  NativeModules,
  Button,
  requireNativeComponent,
  findNodeHandle,
  UIManager
} from 'react-native';

import {
  Header,
  LearnMoreLinks,
  Colors,
  DebugInstructions,
  ReloadInstructions,
} from 'react-native/Libraries/NewAppScreen';

const { PaymentezCustomModule } = NativeModules;
const TESTINGUI =  requireNativeComponent('TESTINGUI')

// const commandName = "create"
// const argument=[]
// const androidViewId=findNodeHandle(someRef)



class App extends React.Component {
  nativeComponentRef;

  // componentDidMount () {
  //   setTimeout(() => {
  //       this.create()
  //   }, 2000)
  // }


  // findId() {
  //   contex
  //   const androidViewId = findNodeHandle(this.androidFragment);
  //   console.log("Native android view", androidViewId)
  // }

  // create() {
  //   const androidViewId = findNodeHandle(this.nativeComponentRef)
  //   console.log("Native android view id", androidViewId)

  //   UIManager.dispatchViewManagerCommand(
  //     androidViewId,
  //     UIManager.MyView.Commands.create.toString(),
  //     [androidViewId],
  //   );
  // }





  render () {
    return(
      <View>
        <Button onPress={() => {
                PaymentezCustomModule.createCalendarEvent('Mudassir', 'Raza', (status) => {
                  console.log('Result ',status);
                 })
            }} title="Create Calender" />
          <TESTINGUI 
          ref={(nativeRef) => this.nativeComponentRef = nativeRef}
          />
                <Button onPress={() => {
                PaymentezCustomModule.createCalendarEvent('Mudassir', 'Raza', (status) => {
                  console.log('Result ',status);
                 })
            }} title="Create Calender" />
      </View>
    )
  }
};

const styles = StyleSheet.create({
  scrollView: {
    backgroundColor: Colors.lighter,
  },
  engine: {
    position: 'absolute',
    right: 0,
  },
  body: {
    backgroundColor: Colors.white,
  },
  sectionContainer: {
    marginTop: 32,
    paddingHorizontal: 24,
  },
  sectionTitle: {
    fontSize: 24,
    fontWeight: '600',
    color: Colors.black,
  },
  sectionDescription: {
    marginTop: 8,
    fontSize: 18,
    fontWeight: '400',
    color: Colors.dark,
  },
  highlight: {
    fontWeight: '700',
  },
  footer: {
    color: Colors.dark,
    fontSize: 12,
    fontWeight: '600',
    padding: 4,
    paddingRight: 12,
    textAlign: 'right',
  },
});

export default App;
