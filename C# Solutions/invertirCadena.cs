//Ejercicio que sirve para invertir una cadena

String text = 'Ejemplo';
String textResult  = '';
for (int i = text.Lenght; i>=0;i--){
	textResult += text[i];
}

Console.WriteLine(textResult);

//Otra manera de realizarlo
char[] chars = text.ToCharArray();
Array.Reverse(chars);
textResult = new String(chars);
Console.WriteLine(textResult);