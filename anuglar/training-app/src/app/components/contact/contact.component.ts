import { Component, OnInit } from '@angular/core';
import { Contact } from 'src/app/models/contact';



@Component({
  selector: 'app-contact',
  templateUrl: './contact.component.html',
  styleUrls: ['./contact.component.css']
})
export class ContactComponent implements OnInit {

  contact: Contact = new Contact('', '', '', '');
  domains: string[] = ['Java', 'Spring Boot', 'Angular', 'AWS'];

  constructor() { }

  ngOnInit(): void {
  }

  onSubmit() {
    console.log(this.contact);
  }
 

}
