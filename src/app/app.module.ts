import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { AngularFireModule } from 'angularfire2';
import { AngularFireDatabaseModule } from 'angularfire2/database';
import { AngularFireAuthModule } from 'angularfire2/auth';
import { environment } from '../environments/environment';
import { RegisterComponent } from './register/register.component';
import { PasswordComponent } from './password/password.component';
import{RouterModule,Routes} from '@angular/router';
import { FirstComponent } from './first/first.component';
import { StarplusComponent } from './starplus/starplus.component';
import { StarworldComponent } from './starworld/starworld.component';
import { StarbharatComponent } from './starbharat/starbharat.component';
import { LifeokComponent } from './lifeok/lifeok.component';
import { StarvijayComponent } from './starvijay/starvijay.component';
import { AboutComponent } from './about/about.component';
import { FormComponent } from './form/form.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

 const appRoutes: Routes  = [
  { path:'register', component: RegisterComponent },
  { path:'form', component: FormComponent },
  { path:'starplus', component: StarplusComponent },
  { path:'starworld', component: StarworldComponent },
  { path:'starbharat', component: StarbharatComponent },
  { path:'starvijay', component: StarvijayComponent },
  { path:'about', component: AboutComponent },
  { path:'lifeok', component: LifeokComponent },
  { path:'first', component: FirstComponent},
  { path:'login', component: LoginComponent},
  { path:'password', component: PasswordComponent},
  { path:'', redirectTo: 'first', pathMatch: 'full'},
  
];

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    RegisterComponent,
    PasswordComponent,
    FirstComponent,
    StarplusComponent,
    StarworldComponent,
    StarbharatComponent,
    LifeokComponent,
    StarvijayComponent,
    AboutComponent,
    FormComponent
    
  ],
  imports: [
    BrowserModule,
    FormsModule,
    AngularFireAuthModule,
    AngularFireDatabaseModule,
    AngularFireModule,
    HttpClientModule,
    ReactiveFormsModule,
    //AngularFireDatabase,
    AngularFireModule.initializeApp(environment.firebaseConfig),
    [ RouterModule.forRoot( appRoutes ,
      { enableTracing: true })
    ],
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
