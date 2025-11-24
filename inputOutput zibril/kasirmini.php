<?php
// Input dari user
$nama = readline("Masukkan nama barang: ");
$harga = floatval(readline("Masukkan harga barang: "));
$jumlah = intval(readline("Masukkan jumlah barang: "));

// Perhitungan
$total = $harga * $jumlah;

if ($total > 56000) {
    $diskon = $total * 0.06;
} else {
    $diskon = 0;
}

$total_bayar = $total - $diskon;

// Output struk
echo "\n===== Struk Pembayaran =====\n";
echo "Nama Barang   : $nama\n";
echo "Harga Barang  : $harga\n";
echo "Jumlah Barang : $jumlah\n";
echo "Total Harga   : $total\n";
echo "Diskon        : $diskon\n";
echo "Total Bayar   : $total_bayar\n";
echo "============================\n";
?>
