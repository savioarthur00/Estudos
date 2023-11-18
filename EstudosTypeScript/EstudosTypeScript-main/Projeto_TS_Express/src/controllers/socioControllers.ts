import { Request, Response } from "express";
import { SocioModel } from "../models/Socio";
import Logger from "../../config/logger";

export async function createSocio(req: Request, res: Response) {
  try {
    const data = req.body;
    const movie = await SocioModel.create(data);
    return res.status(201).json(movie);
  } catch (e: any) {
    Logger.error(`Erro no sistema: ${e.message}`);
    return res.status(500).json({error: "Por favor, tente mais tarde"});
    }
}


export async function findSocioById(req: Request, res: Response) {
  try {
    const id = req.params.id;
    const socio = await SocioModel.findById(id);

    if (!socio) {
      return res.status(404).json({ error: "O Sócio não existe." });
      
    }

    return res.status(200).json(socio);
  } catch (e: any) {
    Logger.error(`Erro no sistema: ${e.message}`);
    return res.status(500).json({error: "Por favor, tente mais tarde"});
  }
}

export async function getAllSocios(req:Request,res:Response){

  try {
    
    const socios = await SocioModel.find()
    return res.status(200).json(socios)
  } catch (e:any) {
    Logger.error(`Erro no sistema: ${e.message}`);
    return res.status(500).json({error: "Por favor, tente mais tarde"});
  }

}

export async function removeSocio(req:Request,res:Response){

  try {
    
    const id = req.params.id
    const socio = await SocioModel.findById(id);

    if(!socio){
      return res.status(404).json({error: "O  sócio buscado não existe, tente novamente"})
    }
    await socio.deleteOne()
    
    return res.status(200).json({msg: "Sócio deletado com sucesso!"})
    
  } catch (e:any) {
    Logger.error(`Erro no sistema: ${e.message}`);
    return res.status(500).json({error: "Por favor, tente mais tarde"});
  }
}

export async function updateSocio(req:Request,res:Response){

  try {
    const id = req.params.id
    const data = req.body
    const socio = await SocioModel.findById(id);

    if(!socio){
      return res.status(404).json({error: "O Sócio buscado não existe, tente novamente"})
    }
    
    await SocioModel.updateOne({_id: id},data)
    return res.status(200).json(data)
    
    
  } catch (e:any) {
    Logger.error(`Erro no sistema: ${e.message}`);
    return res.status(500).json({error: "Por favor, tente mais tarde"});
  }
}