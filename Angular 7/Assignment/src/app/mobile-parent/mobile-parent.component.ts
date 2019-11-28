import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-mobile-parent',
  templateUrl: './mobile-parent.component.html',
  styleUrls: ['./mobile-parent.component.css']
})
export class MobileParentComponent implements OnInit {
  selectedMobile: any;

  Mobiles = [{
    name: 'Asus Zenfone 5',
    price : 'Rs : 14999',
    imgUrl: 'https://cdn.pixabay.com/photo/2016/11/10/16/18/android-1814600_1280.jpg',
    // tslint:disable-next-line: max-line-length
    descri: 'ASUS Mobile X407UB. Processor. Intel® Core™ i3 6006U Processor, 2 GHz (3 M Cache) Operating System. Windows 10 Pro - ASUS recommends Windows 10 Pro. Memory. DDR4 2400MHz SDRAM, 1 x SO-DIMM socket , up to 8 GB SDRAM. Display. 14.0" (16:9) LED-backlit HD (1366x768) 60Hz Anti-Glare Panel with 45% NTSC. Graphic Storage. '
  }, {
    name: 'Samsung galaxy s5',
    price : 'Rs : 35999',
    imgUrl: 'https://cdn.pixabay.com/photo/2016/03/27/19/43/smartphone-1283938_1280.jpg',
    // tslint:disable-next-line: max-line-length
    descri: 'Samsung Galaxy With Alexa In-built. Freedom To Do More w/ Power Of Your Voice. Shop Now! Accidental Protection. Protegent Antivirus. Additional Warranty. Theft Insurance. Models: HP Pavilion x360 14, HP Gaming Pavilion - 15, OMEN by HP 15, HP Notebook - 15.'
  }
];

  constructor() { }

  ngOnInit() {
  }
  sendImg(mobile) {
    console.log(mobile);
    this.selectedMobile = mobile;
  }
}
