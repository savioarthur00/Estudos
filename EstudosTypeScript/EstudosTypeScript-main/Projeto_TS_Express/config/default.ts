const db_user= process.env.DB_USER
const db_pass= process.env.DB_PASS

export default {
    port: 3000,
    
    dbUri:`mongodb+srv://savio:${db_pass}@cluster0.hizztdt.mongodb.net/?retryWrites=true&w=majority`,
    env: "development",
     
}
    

