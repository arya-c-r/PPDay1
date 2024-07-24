import { Component } from '@angular/core';

import { of } from 'rxjs';
import { CustomerTS } from '../../types/tstypes/Customerts';

@Component({
  selector: 'app-customersample',
  standalone: true,
  imports: [],
  templateUrl: './customersample.component.html',
  styleUrls: ['./customersample.component.css']
})
export class CustomersampleComponent {
  customer:any=CustomerTS;
  constructor(){
    this.customer=new CustomerTS("John Doe", "john@example.com", "john_doe", "password123", "User","1");
  }
}

