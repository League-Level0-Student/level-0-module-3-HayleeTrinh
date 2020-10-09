int bob = 99;

for (int i = 0; i < 98; i++){
  print(bob + " bottles of beer on a wall. " + bob + " bottles of beer!");
  bob = bob-1;
  print("Take one down, pass it around." + bob + " bottles of beer on the wall!");
}
if( bob > 0) {
print("No more bottles of beer on the wall. No more bottles of beer!");
bob= bob+98;
print("Go to the store and but some more." + bob + " bottles of beer on the wall!");
}
  
