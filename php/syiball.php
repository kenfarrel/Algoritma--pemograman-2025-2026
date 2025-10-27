<?php
$a = readline("Masukan angka pertama:");
$b = readline("Masukan angka kedua:");

if($a > $b)
    echo"$a lebih besar dari $b\n";
elseif($a < $b)
    echo"$a lebih kecil dari $b\n";
else
    echo"$a Keduanya sama besar\n";

echo"Apakah Keduanya sama?";
echo ($a == $b)?"true\n":"false\n";
?>