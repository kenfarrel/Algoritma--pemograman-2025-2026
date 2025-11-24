#include <iostream>
using namespace std;

int main() {
    string nama;
    double harga, total, total_bayar, diskon;
    int jumlah;

    // Input data
    cout << "Masukkan nama barang: ";
    getline(cin, nama);

    cout << "Masukkan harga barang: ";
    cin >> harga;

    cout << "Masukkan jumlah barang: ";
    cin >> jumlah;

    // Perhitungan
    total = harga * jumlah;

    if (total > 30000) {
        diskon = total * 0.10;
    } else {
        diskon = 0;
    }

    total_bayar = total - diskon;

    // Output Struk
    cout << "\n===== Struk Pembayaran =====" << endl;
    cout << "Nama Barang   : " << nama << endl;
    cout << "Harga Barang  : " << harga << endl;
    cout << "Jumlah Barang : " << jumlah << endl;
    cout << "Total Harga   : " << total << endl;
    cout << "Diskon        : " << diskon << endl;
    cout << "Total Bayar   : " << total_bayar << endl;
    cout << "============================" << endl;

    return 0;
}
