function spinalCase(str) {
   return str.split(/\s|_|(?=[A-Z])/).join("-").toLowerCase();
}

console.log(spinalCase("This Is Spinal Tap"));

console.log(spinalCase("AllThe-small Things"));

console.log(spinalCase("I want to use this means to thank every that has made this training possible"));