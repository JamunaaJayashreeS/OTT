import { Component, OnInit } from '@angular/core';
import { HttpClient, HttpErrorResponse, HttpHeaders, HttpEvent } from '@angular/common/http';
import { mapChildrenIntoArray } from '@angular/router/src/url_tree';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { throwError } from 'rxjs';
import { catchError, switchMap } from 'rxjs/operators';
import { Router } from '@angular/router';
@Component({
  selector: 'app-password',
  templateUrl: './password.component.html',
  styleUrls: ['./password.component.css']
})
export class PasswordComponent implements OnInit {
  public workitemForm: FormGroup;
password : any;
userPassword : string;
  constructor(private http: HttpClient,private router: Router) { 
    this.workitemForm=new FormGroup({
      'userPassword' : new FormControl(null, [Validators.required ])
    });
  }

  ngOnInit() {
    
      
   
  }
  workitemSubmit()
  {
    console.log("%%%%%%%%%%%%%%55")
    console.log(this.userPassword)
    this.serviceCall(this.userPassword).subscribe((result:any)=>{
      console.log(result)
      if(result == true){
      this.router.navigate(['/first']);
      }
    })
    
  }

  serviceCall(userpwd){
    const httpOptions = {
      headers : new HttpHeaders({
        'userId':'admin',
        'password':userpwd

      })
    };
   return this.http.get<any>('http://localhost:4000/admin',httpOptions).pipe(catchError(this.handleError));
    
  }


  private handleError(errorResponse: HttpErrorResponse) {
    if (errorResponse.error instanceof ErrorEvent) {
        console.error('Client Side Error: ', errorResponse.error);
    } else {
        console.log('Server Side Error: ', errorResponse);
    }
    return throwError('There is a problem with the service');

}

}
