/*This Made by Adrian Arman Fuadi 

December 2019*/


package main

import "fmt"
import "math/rand"

type nama_peserta_lomba struct {
	nama        string
	jenis_lomba string
	medali_A    string
	medali_P    string
	medali_R    string
}

type Universitas struct {
	nama_univ               string
	peserta_dan_jenis_lomba [4]nama_peserta_lomba
	skor_juara1A, skor_juara2A  int
	skor_juara1P, skor_juara2P  int
	skor_juara1R, skor_juara2R  int
	skor_total              int
	skor                    int
}

func main() {
	var arr[1000]Universitas
	var i, j, pilih string
	var idx, idx2, bil int
	fmt.Print("\n======================================================================================================")
	fmt.Print("\n=                                                                                                    =")
	fmt.Print("\n=                          ADMINISTRATION USER GEMASTIK KOMPETITION 2K20  :                          =")
	fmt.Print("\n=                                                                                                    =")
	fmt.Print("\n=                                                                                                    =")
	fmt.Print("\n=                       --   Satu Universitas Hanya terdapat 3 peserta  --                           =")
	fmt.Print("\n=                       --             Terdapat 3 Kompetisi             --                           =")
	fmt.Print("\n=                       --   1) Animation  2) Pemrograman 3) Robotik    --                           =")
	fmt.Print("\n======================================================================================================")
	jum := 1
	i = "iya"
	idx = 0
	idx2 = 0
	bil = 1
	total := 0
	for i != "tidak" && i != "TIDAK"{
		fmt.Print("\n Masukan Nama Universitas :")
		fmt.Scan(&arr[idx].nama_univ)
		total = total + 1
		jum = 1
		bil = 1
		idx2 = 0
		for jum <= 3 {
			if bil == 1 {
				fmt.Println("\n Masukan Nama Peserta yang mengikuti lomba Animation : ", bil)
				fmt.Scan(&arr[idx].peserta_dan_jenis_lomba[idx2].nama)
				arr[idx].peserta_dan_jenis_lomba[idx2].jenis_lomba = "Animation"
				fmt.Println("\n Lomba yang di ikuti oleh", ":", arr[idx].peserta_dan_jenis_lomba[idx2].nama)
				fmt.Print("\n",arr[idx].peserta_dan_jenis_lomba[idx2].jenis_lomba )
			}else if bil == 2 {
				fmt.Println("\n Masukan Nama Peserta yang mengikuti lomba Pemrograman : ", bil)
				fmt.Scan(&arr[idx].peserta_dan_jenis_lomba[idx2].nama)
				arr[idx].peserta_dan_jenis_lomba[idx2].jenis_lomba = "Pemrograman"
				fmt.Println("\n Lomba yang di ikuti oleh", ":", arr[idx].peserta_dan_jenis_lomba[idx2].nama)
				fmt.Print("\n",arr[idx].peserta_dan_jenis_lomba[idx2].jenis_lomba )
			}else if bil == 3 {
				fmt.Println("\n Masukan Nama Peserta yang mengikuti lomba Robotik : ", bil)
				fmt.Scan(&arr[idx].peserta_dan_jenis_lomba[idx2].nama)
				arr[idx].peserta_dan_jenis_lomba[idx2].jenis_lomba = "Robotik"
				fmt.Println("\n Lomba yang di ikuti oleh", ":", arr[idx].peserta_dan_jenis_lomba[idx2].nama)
				fmt.Print("\n",arr[idx].peserta_dan_jenis_lomba[idx2].jenis_lomba )
			}
			idx2 = idx2 + 1
			bil = bil + 1
			jum = jum + 1
		}
		fmt.Println("\n ketik [iya], jika ingin lanjut mengisi data")
		fmt.Println("\n Ketik [tidak], jika ingin selesai mengisi data ")
		fmt.Println("\n Lanjut input ? :")
		fmt.Scan(&i)
		idx = idx + 1
	}
	fmt.Print("\n=======================================================================================================")
	fmt.Print("\n                                                                                                       ")
	fmt.Print("\n                                      DAFTAR PESERTA GEMASTIK   :                                      ")
	fmt.Print("\n                                                                                                       ")
	fmt.Print("\n=======================================================================================================")

	jumlah := 0
	idx = 0
	idx2 = 0
	for jumlah < total {
		fmt.Print("\n\t\t\tNama Universitas :", arr[idx].nama_univ)
		fmt.Print("\nNama Peserta ke- 1  :", arr[idx].peserta_dan_jenis_lomba[idx2].nama)
		fmt.Print("\nLomba yang di ikuti :", arr[idx].peserta_dan_jenis_lomba[idx2].jenis_lomba)
		fmt.Print("\nNama Peserta ke- 2  :", arr[idx].peserta_dan_jenis_lomba[idx2+1].nama)
		fmt.Print("\nLomba yang di ikuti :", arr[idx].peserta_dan_jenis_lomba[idx2+1].jenis_lomba)
		fmt.Print("\nNama Peserta ke- 3  :", arr[idx].peserta_dan_jenis_lomba[idx2+2].nama)
		fmt.Print("\nLomba yang di ikuti :", arr[idx].peserta_dan_jenis_lomba[idx2+2].jenis_lomba)
		idx = idx + 1
		jumlah = jumlah + 1
	}
	fmt.Print("\n Ketik [iya], jika ingin mengubah daftar peserta gemastik")
	fmt.Print("\n Ketik [tidak], jika tidak ingin mengubah daftar peserta gemastik")
	fmt.Print("\n Ubah daftar peserta :")
	fmt.Scan(&j)
	if j == "iya" {
		Ubah_peserta(&arr, total)
	}

	fmt.Print("\n=======================================================================================================")
	fmt.Print("\n                                 -- GEMASTIK KOMPETITION 2K20 --                                       ")
	fmt.Print("\n                                                                                                       ")
	fmt.Print("\n                                       INPUT SKOR PESERTA  :                                           ")
	fmt.Print("\n                                                                                                       ")
	fmt.Print("\n         1) Ketik Animation bila ingin input skor 2) Ketik Pemrograman bila ingin input skor           ")
	fmt.Print("\n                               3) Ketik Robotik bila ingin input skor                                  ")
	fmt.Print("\n=======================================================================================================")
	fmt.Print("\n                                                                                                       ")
	l := 0
	for l < 3  {
		fmt.Print("\n Silahkan Pilih jenis lomba : ")
		fmt.Scan(&pilih)
		switch pilih {
		case "Animation" :
			kompetisi_Animation(&arr, total)
		case "Pemrograman" :
			kompetisi_Pemrograman(&arr, total)
		case "Robotik":
			kompetisi_Robotik(&arr, total)
		default :
			fmt.Print("Wah jangan ngawur ya inputnya sesuaikan seperti yang di atas")
		}
		l = l + 1
	}
	Juara_umum(&arr,total)
}
func Final_Random(seed1 int64) int{
	var bilangan1 int
	rand.Seed(seed1)
	bilangan1 = rand.Intn(100)
	return bilangan1
}
func Final_Random2(seed2 int64) int{
	var bilangan2 int
	rand.Seed(seed2)
	bilangan2 = rand.Intn(100)
	return bilangan2
}
func Ubah_peserta(arr *[1000]Universitas, total int) {
	var ubah_peserta string
	var nama_univ string
	ubah_peserta = "iya"
	fmt.Print("\n====================================================")
	fmt.Print("\n=  Isikan string null bila ingin menghapus data    =")
	fmt.Print("\n====================================================")
	for ubah_peserta == "iya" {
		fmt.Print("\nMasukan Nama Universitas :")
		fmt.Scan(&nama_univ)
		idx := 0
		for idx < 100 && arr[idx].nama_univ != nama_univ {
			idx = idx + 1
		}
		if arr[idx].nama_univ == nama_univ {
			idx2 := 0
			fmt.Print("\n Data Ditemukan Silahkan Input kembali ! ")
			fmt.Print("\n             ")
			fmt.Print("\n Masukan nama Universitas :")
			fmt.Scan(&arr[idx].nama_univ)
			if arr[idx].nama_univ == "null" {
				for idx <= total {
					arr[idx] = arr[idx + 1]
					idx = idx + 1
				}
			}else {
				fmt.Print("\n Masukan Nama Peserta -1 [Animation]:")
				fmt.Scan(&arr[idx].peserta_dan_jenis_lomba[idx2].nama)
				fmt.Print("\n Masukkan Nama Peserta -2 [Programing]:")
				fmt.Scan(&arr[idx].peserta_dan_jenis_lomba[idx2+1].nama)
				fmt.Print("\n Masukkan Nama Peserta -3 [Robotik]:")
				fmt.Scan(&arr[idx].peserta_dan_jenis_lomba[idx2+2].nama)
				idx = idx + 1
			}
		} else {
			fmt.Print("\n Data tidak ditemukan !!!")
		}
		fmt.Print("\n Ketik [iya], jika ingin mengubah daftar peserta gemastik")
		fmt.Print("\n Ketik [tidak], jika tidak ingin mengubah daftar peserta gemastik")
		fmt.Print("\n Ubah daftar peserta :")
		fmt.Scan(&ubah_peserta)
	}
	fmt.Print("\n=======================================================================================================")
	fmt.Print("\n                                                                                                       ")
	fmt.Print("\n                                  DAFTAR PESERTA GEMASTIK BARU  :                                      ")
	fmt.Print("\n                                                                                                       ")
	fmt.Print("\n=======================================================================================================")
	jumlah := 0
	idx := 0
	idx2 := 0
	for jumlah < total {
		fmt.Print("\n\t\t\tNama Universitas :", arr[idx].nama_univ)
		fmt.Print("\nNama Peserta ke- 1  :", arr[idx].peserta_dan_jenis_lomba[idx2].nama)
		fmt.Print("\nLomba yang di ikuti :", arr[idx].peserta_dan_jenis_lomba[idx2].jenis_lomba)
		fmt.Print("\nNama Peserta ke- 2  :", arr[idx].peserta_dan_jenis_lomba[idx2+1].nama)
		fmt.Print("\nLomba yang di ikuti :", arr[idx].peserta_dan_jenis_lomba[idx2+1].jenis_lomba)
		fmt.Print("\nNama Peserta ke- 3  :", arr[idx].peserta_dan_jenis_lomba[idx2+2].nama)
		fmt.Print("\nLomba yang di ikuti :", arr[idx].peserta_dan_jenis_lomba[idx2+2].jenis_lomba)
		idx = idx + 1
		jumlah = jumlah + 1
	}
}
func kompetisi_Animation(arr *[1000]Universitas, total int) {
	var seed1, seed2 int64
	fmt.Print("\n-------------------------------------------------------------------------------------------------------")
	fmt.Print("\n                                                                                                       ")
	fmt.Print("\n                            --  BABAK PENYISIHAN ANIMATION COMPETITION --                              ")
	fmt.Print("\n                                                                                                       ")
	fmt.Print("\n                                                                                                       ")
	fmt.Print("\n                                        Input Skor Animation                                           ")
	fmt.Print("\n                                                                                                       ")
	fmt.Print("\n Jika menemukan string kosong isi dengan angka : 0 untuk skor                                          ")
	fmt.Print("\n-------------------------------------------------------------------------------------------------------")	
	
	idx := 0
	idx2 := 0
	i := 0
	for i < total {
		fmt.Print("\nUniversitas :", arr[idx].nama_univ)
		fmt.Print("\nNama Peserta:", arr[idx].peserta_dan_jenis_lomba[idx2].nama)
		fmt.Print("\nSkor        :")
		fmt.Scan(&arr[idx].skor)
		i = i + 1
		idx = idx + 1
	}
	k := 0
	for k < total {
		j := k
		idxmax := k
		for j < total {
			if arr[idxmax].skor < arr[j].skor {
				idxmax = j
			}
			j = j + 1
		}
		temp := arr[idxmax]
		arr[idxmax] = arr[k]
		arr[k] = temp
		k = k + 1
	}
	fmt.Print("\n-------------------------------------------------------------------------------------------------------")
	fmt.Print("\n                                                                                                       ")
	fmt.Print("\n                            --  BABAK SEMIFINAL ANIMATION COMPETITION --                               ")
	fmt.Print("\n                                                                                                       ")
	fmt.Print("\n                                                                                                       ")
	fmt.Print("\n                                        Input Skor Animation                                           ")
	fmt.Print("\n                                                                                                       ")
	fmt.Print("\n List Universitas yang lanjut ke babak SEMIFINAL :")
	fmt.Print("\n Jika menemukan string kosong isi dengan angka : 0 untuk skor                                          ")
	fmt.Print("\n-------------------------------------------------------------------------------------------------------")	
	idx = 0
	for idx <= 3 {
		fmt.Print("\n",arr[idx].nama_univ)
		idx = idx + 1
	}
	idx = 0
	idx2 = 0
	i = 0
	for i <= 3 {
		fmt.Print("\nUniversitas :", arr[idx].nama_univ)
		fmt.Print("\nNama Peserta:", arr[idx].peserta_dan_jenis_lomba[idx2].nama)
		fmt.Print("\nSkor        :")
		fmt.Scan(&arr[idx].skor)
		i = i + 1
		idx = idx + 1
	}
	k = 0
	for k < total {
		j := k
		idxmax := k
		for j < total {
			if arr[idxmax].skor < arr[j].skor {
				idxmax = j
			}
			j = j + 1
		}
		temp := arr[idxmax]
		arr[idxmax] = arr[k]
		arr[k] = temp
		k = k + 1
	}
	fmt.Print("\n-------------------------------------------------------------------------------------------------------")
	fmt.Print("\n                                                                                                       ")
	fmt.Print("\n                           -- !!! BABAK FINAL ANIMATION COMPETITION !!!--                              ")
	fmt.Print("\n                                                                                                       ")
	fmt.Print("\n                                                                                                       ")
	fmt.Print("\n                                     Penentuan Skor Animation                                          ")
	fmt.Print("\n                                                                                                       ")
	fmt.Print("\n List Universitas yang lanjut ke babak FINAL !!! :")
	fmt.Print("\n-------------------------------------------------------------------------------------------------------")   
    idx = 0
	for idx <= 1{
		fmt.Print("\n",arr[idx].nama_univ)
		idx = idx + 1
	}
	idx = 0
	idx2 = 0
	i = 0
	for i <= 1 {
		fmt.Print("\nUniversitas :", arr[idx].nama_univ)
		fmt.Print("\nNama Peserta:", arr[idx].peserta_dan_jenis_lomba[idx2].nama)
		i = i + 1
		idx = idx + 1
	}
	con := true
	for con == true {
		fmt.Print("\n Masukan Bilangan penentuan -1 :")
		fmt.Scan(&seed1)
		fmt.Print("\n Masukan Bilangan penentuan -2 :")
		fmt.Scan(&seed2)
		idx = 0
		arr[idx].skor = Final_Random(seed1)
		idx = 1
		arr[idx].skor = Final_Random2(seed2)
		if arr[0].skor > arr[1].skor {
			arr[0].peserta_dan_jenis_lomba[0].medali_A = " Medali Emas"
			fmt.Print("\n Juara 1 kompetisi Animation Adalah :",arr[0].nama_univ)
			fmt.Print("\n Atas nama :", arr[0].peserta_dan_jenis_lomba[0].nama)
			fmt.Print("\n Mendapatkan medali :",arr[0].peserta_dan_jenis_lomba[0].medali_A)
			fmt.Print("\n                                                                ")
			arr[0].skor_juara1A = arr[0].skor
			arr[1].peserta_dan_jenis_lomba[0].medali_A = "Medali Perak"
			fmt.Print("\n Juara 2 kompetisi Animation Adalah :",arr[1].nama_univ)
			fmt.Print("\n Atas nama :", arr[1].peserta_dan_jenis_lomba[0].nama)
			fmt.Print("\n Mendapatkan medali :",arr[1].peserta_dan_jenis_lomba[0].medali_A)
			arr[1].skor_juara2A = 0 
			con = false
		}else if arr[0].skor < arr[1].skor {
			arr[1].peserta_dan_jenis_lomba[0].medali_A = "Medali Emas"
			fmt.Print("\n Juara 1 kompetisi Animation Adalah :",arr[1].nama_univ)
			fmt.Print("\n Atas nama :", arr[1].peserta_dan_jenis_lomba[0].nama)
			fmt.Print("\n Mendapatkan medali :",arr[1].peserta_dan_jenis_lomba[0].medali_A)
			fmt.Print("\n                                                                ")
            arr[1].skor_juara1A = arr[1].skor
			arr[0].peserta_dan_jenis_lomba[0].medali_A = " Medali Perak "
			fmt.Print("\n Juara 2 kompetisi Animation Adalah :",arr[0].nama_univ)
			fmt.Print("\n Atas nama :", arr[0].peserta_dan_jenis_lomba[0].nama)
			fmt.Print("\n Mendapatkan medali :",arr[0].peserta_dan_jenis_lomba[0].medali_A)
			arr[0].skor_juara2A = 0
			con = false
		}else {
			fmt.Print("Hasil Seri !!!")
			con = true
		}
	}
}
func kompetisi_Pemrograman(arr *[1000]Universitas, total int) {
	var seed1, seed2 int64
	fmt.Print("\n-------------------------------------------------------------------------------------------------------")
	fmt.Print("\n                                                                                                       ")
	fmt.Print("\n                            --  BABAK PENYISIHAN PROGRAMING COMPETITION --                             ")
	fmt.Print("\n                                                                                                       ")
	fmt.Print("\n                                                                                                       ")
	fmt.Print("\n                                        Input Skor Programing                                          ")
	fmt.Print("\n Jika menemukan string kosong isi dengan angka : 0 untuk skor                                          ")
	fmt.Print("\n-------------------------------------------------------------------------------------------------------")
	idx := 0
	idx2 := 1
	i := 1
	for i <= total {
		fmt.Print("\nUniversitas :", arr[idx].nama_univ)
		fmt.Print("\nNama Peserta:", arr[idx].peserta_dan_jenis_lomba[idx2].nama)
		fmt.Print("\nSkor        :")
		fmt.Scan(&arr[idx].skor)
		i = i + 1
		idx = idx + 1
	}
	k := 0
	for k < total {
		j := k
		idxmax := k
		for j < total {
			if arr[idxmax].skor < arr[j].skor {
				idxmax = j
			}
			j = j + 1
		}
		temp := arr[idxmax]
		arr[idxmax] = arr[k]
		arr[k] = temp
		k = k + 1
	}
	fmt.Print("\n-------------------------------------------------------------------------------------------------------")
	fmt.Print("\n                                                                                                       ")
	fmt.Print("\n                            --  BABAK SEMIFINAL PROGRAMING COMPETITION --                              ")
	fmt.Print("\n                                                                                                       ")
	fmt.Print("\n                                                                                                       ")
	fmt.Print("\n                                        Input Skor Programing                                          ")
	fmt.Print("\n                                                                                                       ")
	fmt.Print("\n List Universitas yang lanjut ke babak SEMIFINAL :")
	fmt.Print("\n Jika menemukan string kosong isi dengan angka : 0 untuk skor                                          ")
	fmt.Print("\n-------------------------------------------------------------------------------------------------------")
	idx = 0
	for idx <= 3 {
		fmt.Print("\n",arr[idx].nama_univ)
		idx = idx + 1
	}
	idx = 0
	idx2 = 1
	i = 0
	for i <= 3 {
		fmt.Print("\nUniversitas :", arr[idx].nama_univ)
		fmt.Print("\nNama Peserta:", arr[idx].peserta_dan_jenis_lomba[idx2].nama)
		fmt.Print("\nSkor        :")
		fmt.Scan(&arr[idx].skor)
		i = i + 1
		idx = idx + 1
	}
	k = 0
	for k < total {
		j := k
		idxmax := k
		for j < total {
			if arr[idxmax].skor < arr[j].skor {
				idxmax = j
			}
			j = j + 1
		}
		temp := arr[idxmax]
		arr[idxmax] = arr[k]
		arr[k] = temp
		k = k + 1
	}
	fmt.Print("\n-------------------------------------------------------------------------------------------------------")
	fmt.Print("\n                                                                                                       ")
	fmt.Print("\n                           -- !!! BABAK FINAL PROGRAMING COMPETITION !!!--                             ")
	fmt.Print("\n                                                                                                       ")
	fmt.Print("\n                                                                                                       ")
	fmt.Print("\n                                     Penentuan Skor Programing                                         ")
	fmt.Print("\n                                                                                                       ")
	fmt.Print("\nList Universitas yang lanjut ke babak FINAL !!! :")
	fmt.Print("\n-------------------------------------------------------------------------------------------------------")
	idx = 0
	for idx <= 1{
		fmt.Print("\n",arr[idx].nama_univ)
		idx = idx + 1
	}
	idx = 0
	idx2 = 1
	i = 0
	for i <= 1 {
		fmt.Print("\nUniversitas :", arr[idx].nama_univ)
		fmt.Print("\nNama Peserta:", arr[idx].peserta_dan_jenis_lomba[idx2].nama)
		i = i + 1
		idx = idx + 1
	}
	con := true
	for con == true {
		fmt.Print("\n Masukan Bilangan penentuan -1 :")
		fmt.Scan(&seed1)
		fmt.Print("\n Masukan Bilangan penentuan -2 :")
		fmt.Scan(&seed2)
		idx = 0
		arr[idx].skor = Final_Random(seed1) 
		idx = 1
		arr[idx].skor = Final_Random2(seed2)
		if arr[0].skor > arr[1].skor {
			arr[0].peserta_dan_jenis_lomba[1].medali_P = " Medali Emas"
			fmt.Print("\n Juara 1 kompetisi Programing Adalah :",arr[0].nama_univ)
			fmt.Print("\n Atas nama :", arr[0].peserta_dan_jenis_lomba[1].nama)
			fmt.Print("\n Mendapatkan medali :",arr[0].peserta_dan_jenis_lomba[1].medali_P)
			fmt.Print("\n                                                                ")
			arr[0].skor_juara1P = arr[0].skor
			arr[1].peserta_dan_jenis_lomba[1].medali_P = "Medali Perak"
			fmt.Print("\n Juara 2 kompetisi Programing Adalah :",arr[1].nama_univ)
			fmt.Print("\n Atas nama :", arr[1].peserta_dan_jenis_lomba[1].nama)
			fmt.Print("\n Mendapatkan medali :",arr[1].peserta_dan_jenis_lomba[1].medali_P)
			arr[1].skor_juara2P = 0
			con = false
		}else if arr[0].skor < arr[1].skor {
			arr[1].peserta_dan_jenis_lomba[1].medali_P = "Medali Emas"
			fmt.Print("\n Juara 1 kompetisi Programing Adalah :",arr[1].nama_univ)
			fmt.Print("\n Atas nama :", arr[1].peserta_dan_jenis_lomba[1].nama)
			fmt.Print("\n Mendapatkan medali :",arr[1].peserta_dan_jenis_lomba[1].medali_P)
			fmt.Print("\n                                                                ")
			arr[1].skor_juara1P = arr[1].skor
			arr[0].peserta_dan_jenis_lomba[1].medali_P = " Medali Perak "
			fmt.Print("\n Juara 2 kompetisi Programing Adalah :",arr[0].nama_univ)
			fmt.Print("\n Atas nama :", arr[0].peserta_dan_jenis_lomba[1].nama)
			fmt.Print("\n Mendapatkan medali :",arr[0].peserta_dan_jenis_lomba[1].medali_P)
			arr[0].skor_juara2P = 0
			con = false
		}else {
			fmt.Print("Hasil Seri !!!")
			con = true
		}
	}
}
func kompetisi_Robotik(arr *[1000]Universitas, total int) {
	var seed1, seed2 int64
	fmt.Print("\n-------------------------------------------------------------------------------------------------------")
	fmt.Print("\n                                                                                                       ")
	fmt.Print("\n                            --  BABAK PENYISIHAN ROBOTIC COMPETITION --                                ")
	fmt.Print("\n                                                                                                       ")
	fmt.Print("\n                                                                                                       ")
	fmt.Print("\n                                        Input Skor Robotik                                             ")
	fmt.Print("\n Jika menemukan string kosong isi dengan angka : 0 untuk skor                                          ")
	fmt.Print("\n-------------------------------------------------------------------------------------------------------")
	idx := 0
	idx2 := 2
	i := 1
	for i <= total {
		fmt.Print("\nUniversitas :", arr[idx].nama_univ)
		fmt.Print("\nNama Peserta:", arr[idx].peserta_dan_jenis_lomba[idx2].nama)
		fmt.Print("\nSkor        :")
		fmt.Scan(&arr[idx].skor)
		i = i + 1
		idx = idx + 1
	}
	k := 0
	for k < total {
		j := k
		idxmax := k
		for j < total {
			if arr[idxmax].skor < arr[j].skor {
				idxmax = j
			}
			j = j + 1
		}
		temp := arr[idxmax]
		arr[idxmax] = arr[k]
		arr[k] = temp
		k = k + 1
	}
	fmt.Print("\n-------------------------------------------------------------------------------------------------------")
	fmt.Print("\n                                                                                                       ")
	fmt.Print("\n                            --  BABAK SEMIFINAL ROBOTIC COMPETITION --                                 ")
	fmt.Print("\n                                                                                                       ")
	fmt.Print("\n                                                                                                       ")
	fmt.Print("\n                                        Input Skor Robotik                                             ")
	fmt.Print("\n                                                                                                       ")
	fmt.Print("\n List Universitas yang lanjut ke babak SEMIFINAL :")
	fmt.Print("\n Jika menemukan string kosong isi dengan angka : 0 untuk skor                                          ")
	fmt.Print("\n-------------------------------------------------------------------------------------------------------")
	idx = 0
	for idx <= 3 {
		fmt.Print("\n",arr[idx].nama_univ)
		idx = idx + 1
	}
	idx = 0
	idx2 = 2
	i = 0
	for i <= 3 {
		fmt.Print("\nUniversitas :", arr[idx].nama_univ)
		fmt.Print("\nNama Peserta:", arr[idx].peserta_dan_jenis_lomba[idx2].nama)
		fmt.Print("\nSkor        :")
		fmt.Scan(&arr[idx].skor)
		i = i + 1
		idx = idx + 1
	}
	k = 0
	for k < total {
		j := k
		idxmax := k
		for j < total {
			if arr[idxmax].skor < arr[j].skor {
				idxmax = j
			}
			j = j + 1
		}
		temp := arr[idxmax]
		arr[idxmax] = arr[k]
		arr[k] = temp
		k = k + 1
	}
	fmt.Print("\n-------------------------------------------------------------------------------------------------------")
	fmt.Print("\n                                                                                                       ")
	fmt.Print("\n                           -- !!! BABAK FINAL ROBOTIC COMPETITION !!!--                                ")
	fmt.Print("\n                                                                                                       ")
	fmt.Print("\n                                                                                                       ")
	fmt.Print("\n                                      Penentuan Skor Robotik                                           ")
	fmt.Print("\n                                                                                                       ")
	fmt.Print("\nList Universitas yang lanjut ke babak FINAL !!! :")
	fmt.Print("\n-------------------------------------------------------------------------------------------------------")
	idx = 0
	for idx <= 1{
		fmt.Print("\n",arr[idx].nama_univ)
		idx = idx + 1
	}
	idx = 0
	idx2 = 2
	i = 0
	for i <= 1 {
		fmt.Print("\nUniversitas :", arr[idx].nama_univ)
		fmt.Print("\nNama Peserta:", arr[idx].peserta_dan_jenis_lomba[idx2].nama)
		i = i + 1
		idx = idx + 1
	}
	con := true
	for con == true {
		fmt.Print("\n Masukan Bilangan penentuan -1 :")
		fmt.Scan(&seed1)
		fmt.Print("\n Masukan Bilangan penentuan -2 :")
		fmt.Scan(&seed2)
		idx = 0
		arr[idx].skor = Final_Random(seed1)
		idx = 1
		arr[idx].skor = Final_Random2(seed2)
		if arr[0].skor > arr[1].skor {
			arr[0].peserta_dan_jenis_lomba[2].medali_R = "Medali Emas"
			fmt.Print("\n Juara 1 kompetisi Robotik Adalah :",arr[0].nama_univ)
			fmt.Print("\n Atas nama :", arr[0].peserta_dan_jenis_lomba[2].nama)
			fmt.Print("\n Mendapatkan medali :",arr[0].peserta_dan_jenis_lomba[2].medali_R)
			arr[0].skor_juara1R = arr[0].skor
			fmt.Print("\n                                                      ")
			arr[1].peserta_dan_jenis_lomba[2].medali_R = "Medali Perak"
			fmt.Print("\n Juara 2 kompetisi Robotik Adalah :",arr[1].nama_univ)
			fmt.Print("\n Atas nama :", arr[1].peserta_dan_jenis_lomba[2].nama)
			fmt.Print("\n Mendapatkan medali :",arr[1].peserta_dan_jenis_lomba[2].medali_R)
			arr[1].skor_juara2R = 0
			con = false
		}else if arr[0].skor < arr[1].skor {
			arr[1].peserta_dan_jenis_lomba[2].medali_R = "Medali Emas"
			fmt.Print("\n Juara 1 kompetisi Robotik Adalah :",arr[1].nama_univ)
			fmt.Print("\n Atas nama :", arr[1].peserta_dan_jenis_lomba[2].nama)
			fmt.Print("\n Mendapatkan medali :",arr[1].peserta_dan_jenis_lomba[2].medali_R)
			fmt.Print("\n                                                      ")
			arr[1].skor_juara1R = arr[1].skor
			arr[0].peserta_dan_jenis_lomba[2].medali_R = "Medali Perak"
			fmt.Print("\n Juara 2 kompetisi Robotik Adalah :",arr[0].nama_univ)
			fmt.Print("\n Atas nama :", arr[0].peserta_dan_jenis_lomba[2].nama)
			fmt.Print("\n Mendapatkan medali :",arr[0].peserta_dan_jenis_lomba[2].medali_R)
			arr[0].skor_juara2R = 0
			con = false
		}else {
			fmt.Print("Hasil Seri !!!")
			con = true
		}
	}
}
func Juara_umum(arr *[1000]Universitas, total int) {
	var total1,total2,total3 int
	idx := 0
	for idx <= total {
		total1 = arr[idx].skor_juara1A + arr[idx].skor_juara2A
		total2 = arr[idx].skor_juara1P + arr[idx].skor_juara2P
		total3 = arr[idx].skor_juara1R + arr[idx].skor_juara2R
		arr[idx].skor_total = total1 + total2 + total3
		idx = idx + 1
	}
	k := 0
	for k < total {
		j := k
		idxmax := k
		for j < total {
			if arr[idxmax].skor_total < arr[j].skor_total {
				idxmax = j
			}
			j = j + 1
		}
		temp := arr[idxmax]
		arr[idxmax] = arr[k]
		arr[k] = temp
		k = k + 1
	}
	fmt.Print("\n-------------------------------------------------------------------------------------------------------")
	fmt.Print("\n                                                                                                       ")
	fmt.Print("\n                                  --  JUARA UMUM GEMASTIK 2K20 --                                      ")
	fmt.Print("\n                                                                                                       ")
	fmt.Print("\n                                                                                                       ")
	fmt.Print("\n                                            ADALAH !!! :                                               ")
	fmt.Print("\n                                                                                                       ")
	fmt.Print("\n-------------------------------------------------------------------------------------------------------")

	idx = 0
	fmt.Print("\nJuara Umum Gemastik 2K20 Adalah :", arr[idx].nama_univ)
	fmt.Print("\n Cabang lomba :", arr[idx].peserta_dan_jenis_lomba[0].jenis_lomba)
	fmt.Print("\n Dengan Perolehan Medali ", arr[idx].peserta_dan_jenis_lomba[0].medali_A)
	fmt.Print("\n Cabang lomba :", arr[idx].peserta_dan_jenis_lomba[1].jenis_lomba)
	fmt.Print("\n Dengan Perolehan Medali ", arr[idx].peserta_dan_jenis_lomba[1].medali_P)
	fmt.Print("\n Cabang lomba :", arr[idx].peserta_dan_jenis_lomba[2].jenis_lomba)
	fmt.Print("\n Dengan Perolehan Medali ", arr[idx].peserta_dan_jenis_lomba[2].medali_P)
	fmt.Print("\n Universitas :",arr[idx].nama_univ,"memiliki skor tertinggi pada salah satu lomba atau setiap lomba")
	fmt.Print("\n Sehingga mendapatkan Juara Umum")
}

