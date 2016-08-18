Welcome to _Woodcoin Wallet_, a standalone Woodcoin payment app for your Android device!

This project contains several sub-projects:

 * __wallet__:
     The Android app itself. This is probably what you're searching for.
 * __market__:
     App description and promo material for the Google Play app store.
 * __integration-android__:
     A tiny library for integrating Woodcoin payments into your own Android app
     (e.g. donations, in-app purchases).
 * __sample-integration-android__:
     A minimal example app to demonstrate integration of Woodcoin payments into
     your Android app.

You can build all sub-projects at once using Gradle:

`gradle clean assemble`

Currently the wallet is top priority.

When gradle runs, it will grab a stock bitcoinj from online somewhere, and put it in a directory similar to:
~/.gradle/caches/modules/files/org.bitcoinj/core/0.14.2/XXXXXXXXXXX

After it runs, find the directory and replace the jar file with one with the same name which you have built from woodcoinj-dev or equivalent.  

Now, when you run 'gradle clean assemble' it will build the apk using this library instead of the bitcoin library.  

TODO-

Fix build process so woodcoinj jar file can be named woodoinj.jar instead of bitcoinj.jar

Fix exchange lookups

Fix block explorer links 

Fix send requirements (LOG should be immediately transactable, no need to wait for confirms if the user so wishes)  



