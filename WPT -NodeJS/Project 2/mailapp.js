//Email send

const mailer=require('nodemailer');

let transport=mailer.createTransport({
    service:'gmail',
    auth:{
        user:'heyaniketkhatal@gmail.com',
        pass:'tyiyiuqxvigrpgno'
    }
})

let messgaeOb={
    from:'heyaniketkhatal@gmail.com',
    to:'missionaug24@gmail.com',
    subject:'Sending email Using Node js express js',
    text:'This mail send using the node js'
}
transport.sendMail(messgaeOb,(error, info) => {
    if (error) {
        console.log(error);
        } else {
            console.log("Email sent:");
            console.log(info.response);
        }
});

//tyiy iuqx vigr pgno