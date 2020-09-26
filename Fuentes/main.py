import Crypto
import binascii

from Crypto.PublicKey import RSA
from Crypto.Cipher import PKCS1_OAEP

random_generator = Crypto.Random.new().read

private_key = RSA.generate (1024, random_generator)
public_key = private_key.publickey()

private_key = private_key.exportKey (format='DER')
public_key = public_key.exportKey(format= 'DER')

private_key = binascii.hexlify(private_key).decode('utf8')
public_key = binascii.hexlify(public_key).decode('utf8')

print(private_key)
print(public_key)

#Proceso inverso
private_key = RSA.importKey (binascii.unhexlify(private_key))
public_key = RSA.importKey (binascii.unhexlify(public_key))

message = 'Hola a todos desde un string en texto plano!'
message = message.encode()

cipher = PKCS1_OAEP.new(public_key)
encrypted_message = cipher.encrypt(message)

print (encrypted_message)

cipher = PKCS1_OAEP.new(private_key)
message = cipher.decrypt (encrypted_message)

print(message)
