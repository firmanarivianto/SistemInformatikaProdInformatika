package com.firman.sisfo_prodi_informatika

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        kontakdosen1.setOnClickListener {
            val phoneNumber = "081327783279"
            val dialPhoneIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
            startActivity(dialPhoneIntent)
        }

        kontakdosen2.setOnClickListener {
            val phoneNumber = "08122850381"
            val dialPhoneIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
            startActivity(dialPhoneIntent)
        }

        kontakdosen3.setOnClickListener {
            val phoneNumber = "085740266613"
            val dialPhoneIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
            startActivity(dialPhoneIntent)
        }

         kontakdosen4.setOnClickListener {
             val phoneNumber = "082138274801"
             val dialPhoneIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
             startActivity(dialPhoneIntent)
         }

         kontakdosen5.setOnClickListener {
             val phoneNumber = "085225922590"
             val dialPhoneIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
             startActivity(dialPhoneIntent)
         }

          kontakdosen6.setOnClickListener {
              val phoneNumber = "08377479974"
              val dialPhoneIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
              startActivity(dialPhoneIntent)
          }

           kontakdosen7.setOnClickListener {
               val phoneNumber = "000000000"
               val dialPhoneIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
               startActivity(dialPhoneIntent)
           }

           kontakdosen8.setOnClickListener {
               val phoneNumber = "081328522082"
               val dialPhoneIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
               startActivity(dialPhoneIntent)
           }

           kontakdosen9.setOnClickListener {
               val phoneNumber = "081250911793"
               val dialPhoneIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
               startActivity(dialPhoneIntent)
           }


        }

    }

