# Prueba Topicos 

## CRUD
problema:
Desarrollar una aplicación en Android que tenga implementado un CRUD sobre firebase.

### Resolusion
1. Creamos un nuevo proyecto y configuramos firebase 

![](https://raw.githubusercontent.com/SANMH/prueba1_topicos/master/assets/1.png)

2.Agregamos los los campos nesesarios para nuestro registro.
![](https://raw.githubusercontent.com/SANMH/prueba1_topicos/master/assets/2.png)
3. Creamos una nueva java.class y agregamos los campos que se pediran en el registro
```
package com.example.prueba.model;

public class persona {
private String uid;
private String nombre;
private String apellido;
private String correo;
private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public persona() {
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return nombre;
    }
}

```
5. conectamos con la base de datos de firebase
![](https://raw.githubusercontent.com/SANMH/prueba1_topicos/master/assets/base.png)


4. Agregamos y configuramos nuestro menu: agregar, actualizar, borrar
![](https://raw.githubusercontent.com/SANMH/prueba1_topicos/master/assets/3.png)

5.Creamos un SplashScreen y lo configuramos

![](https://raw.githubusercontent.com/SANMH/prueba1_topicos/master/assets/4.png)

6. configuramos nuestro manifiesto de inicio

```
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    package="com.example.prueba">

    <application
        android:allowBackup="true"
        android:icon="@mipmap/ic_launcher"
        android:label="@string/app_name"
        android:roundIcon="@mipmap/ic_launcher_round"
        android:supportsRtl="true"
        android:theme="@style/AppTheme">
        <activity android:name=".SplashActivity2">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />

                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>

        </activity>
        <activity android:name=".MainActivity">

        </activity>
    </application>

</manifest>

```

7. resulatado:

![](https://raw.githubusercontent.com/SANMH/prueba1_topicos/master/assets/5.png)

![](https://raw.githubusercontent.com/SANMH/prueba1_topicos/master/assets/6.png)

![](https://raw.githubusercontent.com/SANMH/prueba1_topicos/master/assets/9.png)


https://prueba1-82014.firebaseio.com/



