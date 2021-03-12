import { Component } from '@angular/core';

@Component({
  selector: 'app-root',   //user-defined 
  templateUrl: './app.component.html',  //like script 
  styleUrls: ['./app.component.css']    //link 
})

export class AppComponent {
  name:string="Akash Kale";   //String name="Ravi Kumar";
  id:number=100;
  salary:number=25000;
  dateOfJoing:Date=new Date();

  changeSalary() {
      this.salary=this.salary +2000;
  }

  }
